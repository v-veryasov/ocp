package leedCode;

import java.util.HashMap;

public class LRUCache2 {

    class Node {
        private int key, value;
        private Node pred, next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int capacity;
    private final HashMap<Integer, Node> map;
    private Node head = new Node(-1, -1);
    private Node tail = new Node(-1, -1);


    public LRUCache2(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>(capacity);
        head.next = tail;
        tail.pred = head;
    }

    private void moveToLast(Node node) {
        remove(node);

        //offerLast
        node.pred = tail.pred;
        node.next = tail;

        tail.pred = node;
        node.pred.next = node;
    }

    private void remove(Node node) {
        node.pred.next = node.next;
        node.next.pred = node.pred;
    }

    private Integer removeFirst() {
        head.next = head.next.next;
        head.next.pred = head;
        return head.next.value;
    }

    public int get(int key) {
        if (!map.containsKey(key))
            return -1;
        moveToLast(map.get(key));
        return map.get(key).value;
    }

    public void put(int key, int value) {
        Node node = new Node(key, value);

        if (map.containsKey(key)) {
            remove(map.get(key));
        } else if (map.size() == capacity) {
            map.remove(removeFirst());
        }
        moveToLast(node);
        map.put(key, node);
    }

    public void print() {
        map.values().forEach(System.out::println);
    }

    public static void main(String[] args) {
        LRUCache2 cache = new LRUCache2(2);
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
