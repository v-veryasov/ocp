package leedCode;

import java.util.HashMap;
import java.util.LinkedList;

// + state
public class LRUCache {

    private final int capacity;
    private final HashMap<Integer, Integer> map;
    private final LinkedList<Integer> queue;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>(capacity);
        queue = new LinkedList<>();
    }

    public int get(int key) {
        if (!map.containsKey(key))
            return -1;
        queue.remove((Integer) key);
        queue.offerLast(key);
        return map.get(key);
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            queue.remove((Integer) key);
        } else if (map.size() == capacity)
            map.remove(queue.removeFirst());
        queue.offerLast(key);
        map.put(key, value);
    }

    public void print() {
        map.values().forEach(System.out::println);
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.get(2);
        cache.put(2, 6);
        cache.get(1);
        cache.put(1, 5);
        cache.put(1, 2);
        cache.get(1);
        cache.get(2);
//        cache.put(4, 1);
//        cache.get(4);
        cache.print();
    }
}
