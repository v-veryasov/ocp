package leedCode;

import java.util.HashMap;
import java.util.LinkedList;

public class LFUCache {

    private final HashMap<Integer, Integer> store; // Key, Value
    private final HashMap<Integer, Integer> freqQueue; // Key, Сount
    private final HashMap<Integer, LinkedList<Integer>> leastQueue; // Сount, Key
    private final int capacity;

    private int min;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        store = new HashMap<>(capacity);
        freqQueue = new HashMap<>(capacity);
        leastQueue = new HashMap<>();
        leastQueue.put(1, new LinkedList<>());
    }

    public int get(int key) {
        if (!store.containsKey(key))
            return -1;
        var count = freqQueue.get(key);
        var tempLRU = leastQueue.get(count);
        tempLRU.remove((Integer) key);

        if (count == min && tempLRU.size() == 0) {
            min++;
        }
        freqQueue.put(key, ++count);
        // get by ++count object
        tempLRU = leastQueue.get(count);

        if (tempLRU != null) {
            tempLRU.addFirst(key);
        } else {
            tempLRU = new LinkedList<>();
            tempLRU.addFirst(key);
            leastQueue.put(count, tempLRU);
        }
        return store.get(key);
    }

    public void put(int key, int value) {
        if (capacity <= 0)
            return;

        if (store.containsKey(key)) {
            store.put(key, value);
            get(key);
            return;
        } else if (store.size() == capacity) {
            int removeKey = leastQueue.get(min).removeLast();
            freqQueue.remove(removeKey);
            store.remove(removeKey);
        }
        freqQueue.put(key, 1);
        store.put(key, value);
        leastQueue.get(1).addFirst(key); // т.к. с частотой 1 всегда есть queue
        min = 1;
    }

    public static void main(String[] args) {
        LFUCache obj = new LFUCache(2);
        obj.put(1, 1);
        obj.put(2, 2);
        int param_1 = obj.get(1);
        //int param_2 = obj.get(1);
        //int param_3 = obj.get(2);
        obj.put(3, 3);
        //obj.put(4, 4);
        int param_4 = obj.get(2);
        int param_5 = obj.get(3);
        obj.put(4, 4);
        int param_6 = obj.get(1);
        int param_7 = obj.get(3);
        int param_3 = obj.get(4);
    }
}
