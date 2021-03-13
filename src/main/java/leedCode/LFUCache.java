package leedCode;

import java.util.HashMap;
import java.util.LinkedList;

public class LFUCache {

    private final HashMap<Integer, Integer> map; // Key, Value
    private final HashMap<Integer, Integer> freqQueue; // Key, Сount
    private final HashMap<Integer, LinkedList<Integer>> leastQueue ; // Сount, Key
    private final int capacity;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>(capacity);
        freqQueue = new HashMap<>(capacity);
        leastQueue = new HashMap<>();
        leastQueue.put(1, new LinkedList<>());
    }

    public int get(int key) {
        if (!map.containsKey(key))
            return -1;
        int count = freqQueue.get(key);
        leastQueue.get(count).remove((Integer) key);
        freqQueue.put(key, ++count);
        addFirstInLeastQueue(key, count);
        return map.get(key);
    }

    public void put(int key, int value) {
        if (capacity <=0 )
            return;

        int count = 1;
        if (map.containsKey(key)) {
            count = freqQueue.get(key);
            leastQueue.get(count).remove((Integer) key);
            ++count;
        } else if (map.size() == capacity) {
            for (var entity : leastQueue.entrySet()) {
                if (entity.getValue().size() > 0) {
                    int removeKey = entity.getValue().removeLast();
                    freqQueue.remove(removeKey);
                    map.remove(removeKey);
                    break;
                }
            }
        }
        freqQueue.put(key, count);
        map.put(key, value);
        addFirstInLeastQueue(key, count);
    }

    private void addFirstInLeastQueue(int key, int count) {
        var obj = leastQueue.get(count);
        if (obj != null) {
            obj.addFirst(key);
        } else {
            LinkedList<Integer> objects = new LinkedList<>();
            objects.addFirst(key);
            leastQueue.put(count, objects);
        }
    }

    public static void main(String[] args) {
        LFUCache obj = new LFUCache(0);
        obj.put(0, 0);
        obj.put(1, 1);
        int param_1 = obj.get(2);
        int param_2 = obj.get(1);
        int param_3 = obj.get(2);
        obj.put(3, 3);
        obj.put(4, 4);
        int param_4 = obj.get(3);
        int param_5 = obj.get(2);
        int param_6 = obj.get(1);
        int param_7 = obj.get(4);
    }
}
