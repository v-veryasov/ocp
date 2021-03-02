package leedCode;

public class BST {
    public static void main(String[] args) {
//        [4,2,5,null,3]
        var o1 = new TreeNode(41, new TreeNode(37,  new TreeNode(24), new TreeNode(39)), new TreeNode(44));
        System.out.println( kthSmallest(o1, 25));
    }

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

    public static int kthSmallest(TreeNode root, int k) {
        if (root.val == k) {
            return root.val;
        } else if (root.val > k) {
            if (root.left == null) {
                return root.val;
            }
            return kthSmallest(root.left, k);
        } else {
            if (root.right == null) {
                return root.val;
            }
            return kthSmallest(root.right, k);
        }
    }
}
