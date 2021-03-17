package leedCode;

import java.util.HashMap;

public class LRUCache2 {

    class Node {
        private final int key;
        private final int value;
        private Node pred, next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    '}';
        }
    }

    private final int capacity;
    private final HashMap<Integer, Node> map;
    private final Node head = new Node(-1, -1);
    private final Node tail = new Node(-1, -1);

    public LRUCache2(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>(capacity);
        head.next = tail;
        tail.pred = head;
    }

    private void add(Node node) {
        node.pred = head;
        Node headNext = head.next;
        head.next = node;
        headNext.pred = node;
        node.next = headNext;
    }

    private void remove(Node node) {
        node.pred.next = node.next;
        node.next.pred = node.pred;
    }

    public int get(int key) {
        if (!map.containsKey(key))
            return -1;
        remove(map.get(key));
        add(map.get(key));
        return map.get(key).value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            remove(map.get(key));
        } else if (map.size() == capacity) {
            map.remove(tail.pred.key);
            remove(tail.pred);
        }
        Node node = new Node(key, value);
        add(node);
        map.put(key, node);
    }

    @Override
    public String toString() {
        return "LRUCache2{" +
                "map=" + map +
                '}';
    }

    public static void main(String[] args) {
        LRUCache2 cache = new LRUCache2(2);
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(" " + cache.get(1));
        cache.put(3, 3);
        System.out.println(" " + cache.get(2));
        cache.put(4, 4);
        System.out.println(" " + cache.get(1));
        System.out.println(" " + cache.get(3));
        System.out.println(" " + cache.get(4));
        System.out.println(cache.toString());
    }
}
