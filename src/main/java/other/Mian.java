package other;

import java.util.*;

public class Mian {
    public static void main(String[] args) {
//        LinkedList
    }

    class Node {
        Integer value;
        Node next;
        Node prev;
    }

    class LList {
        Node head;

        void remove(Integer value) {
            Node node = find(value);
            node.next.prev = node.prev;
            node.prev.next = node.next;
            node = null;
        }

        Node find(Integer value) {
            return head.value.equals(value) ? head : find(head.next.value);
        }

        //1 - 2 - 3 (2, 3, 4) -> 1 - 2 - 4 - 3
        void add(Integer prev, Integer next, Integer value) {

        }
    }
}
