package sort;

public class Test {
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode nodeA = new ListNode(2, null);
        ListNode nodeAA = new ListNode(4, nodeA);
        ListNode nodeAAA = new ListNode(3, nodeAA);

        ListNode nodeB = new ListNode(5, null);
        ListNode nodeBB = new ListNode(6, nodeB);
        ListNode nodeBBB = new ListNode(4, nodeBB);

        ListNode node1 = addTwoNumbers(nodeAAA, nodeBBB);

        while (node1 != null) {
            System.out.print(node1.val);
            node1 = node1.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        int up = 0;
        ListNode current = result;
        while (l1 != null || l2 != null) {
            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;
            int sum = l1Val + l2Val + (up != 0 ? up-- : up);
            if (sum >= 10) {
                current.val = sum % 10;
                up = sum / 10;
            } else {
                current.val = sum;
            }

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }

            if (l1 != null || l2 != null || up != 0) {
                current.next = new ListNode(up);
                current = current.next;
            }
        }
        return result;
    }
}
