package leedCode;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache3 {

    private final LinkedHashMap<Integer, Integer> map;

    public LRUCache3(int capacity) {
        this.map = new LinkedHashMap<>(16, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > capacity;
            }
        };
    }

    public int get(int key) {
        if (!map.containsKey(key))
            return -1;
        return map.get(key);
    }

    public void put(int key, int value) {
        map.put(key, value);
    }

    @Override
    public String toString() {
        return "LRUCache3{" +
                "map=" + map +
                '}';
    }

    public static void main(String[] args) {
        LRUCache3 lruCache3 = new LRUCache3(2);
        lruCache3.put(1, 1);
        lruCache3.put(2, 2);
        lruCache3.get(1);
        lruCache3.put(3, 3);
        System.out.println(lruCache3);
    }
}
