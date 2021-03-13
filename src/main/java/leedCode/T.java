package leedCode;

public class T {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public static void main(String[] args) {
        var i = maxDepth(new TreeNode(3,
                new TreeNode(9,
                        null,
                        null),
                new TreeNode(20,
                        new TreeNode(15, null, null),
                        new TreeNode(7, null, null))));
        System.out.println(i);
    }
}
