package leedCode;

public class Node {

    public Node next;
    public int v;

    public Node(int v, Node next) {
        this.v = v;
        this.next = next;
    }

    public static Node reverse(Node n) {
        Node first = n;
        Node second = n.next;
        Node third = second.next;

        first.next = null;
        second.next = first;

        Node current = third;
        Node previous = second;

        while (current != null) {
            Node next = current.next;
            current.next = previous;

            previous = current;
            current = next;
        }

        return previous;
    }

    public static void main(String[] args) {
        Node n = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, null)))));
        Node result = reverse(n);
    }
}