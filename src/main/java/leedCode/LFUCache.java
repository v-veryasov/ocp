package leedCode;

import java.util.*;

public class LFUCache {

    private final HashMap<Integer, Integer> map; // K, V
    private final HashMap<Integer, Integer> queue; // K, C
    private final HashMap<Integer, LinkedHashSet<Integer>> queueLRU;
    private final int capacity;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>(capacity);
        queue = new HashMap<>(capacity);
        queueLRU = new HashMap<>();
        queueLRU.put(1, new LinkedHashSet<>());
    }

    public int get(int key) {
        if (!map.containsKey(key))
            return -1;
        int count = queue.get(key);
        queue.put(key, ++count);
        return map.get(key);
    }

    public void put(int key, int value) {
        int count = 1;
        if (map.containsKey(key)) {
            count = queue.get(key);
            ++count;
        } else if (map.size() == capacity) {
            var minKey = queue.entrySet()
                    .stream()
                    .min(Comparator.comparingInt(Map.Entry::getValue));
            queue.remove(minKey.get().getKey());
            map.remove(minKey.get().getKey());
        }
        queue.put(key, count);
        map.put(key, value);
        queueLRU.get(count).add(key);
    }

    public static void main(String[] args) {
        LFUCache obj = new LFUCache(2);
        obj.put(1, 1);
        obj.put(2, 2);
//        int param_1 = obj.get(1);
        obj.put(1, 1);
        int param_2 = obj.get(2);
        int param_3 = obj.get(3);
        obj.put(4, 4);
        int param_4 = obj.get(1);
        int param_5 = obj.get(3);
        int param_6 = obj.get(4);

    }
}
