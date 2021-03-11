package leedCode;

class MergeTwoLists {
    public static class ListNode {
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

        @Override
        public String toString() {
            var str = "ListNode{" +
                    "val = " + val +
                    ", next = ";
            return str += (next == null ? null: next.toString()) + " }";
        }
    }


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node = null;
        if (l1 == null && l2 == null) {
            return node;
        }

        boolean existL1 = l1 != null;
        boolean existL2 = l2 != null;

        if (!existL2 || existL1 && l1.val < l2.val) {
            node = new ListNode(l1.val, mergeTwoLists(l1.next, l2));
        } else if (!existL1 || l1.val > l2.val) {
            node = new ListNode(l2.val, mergeTwoLists(l1, l2.next));
        } else {
            node = new ListNode(l1.val, new ListNode(l2.val, mergeTwoLists(l1.next, l2.next)));
        }

        return node;
    }

    public static void main(String[] args) {
        var i = new ListNode(1, new ListNode(2, null));
        var j = new ListNode(1, new ListNode(3, null));
        System.out.println(new MergeTwoLists().mergeTwoLists(i, j));
    }
}
