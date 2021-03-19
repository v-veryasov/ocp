package leedCode;

public class MaxDepth {

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

    int max = 0;
    private int count = 0;

    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        System.out.println(new MaxDepth().maxDepth(
                new TreeNode(1,
                        new TreeNode(2,
                                new TreeNode(3, null, null),
                                new TreeNode(4, new TreeNode(1, null, null), null)),
                        null )));
    }
}

