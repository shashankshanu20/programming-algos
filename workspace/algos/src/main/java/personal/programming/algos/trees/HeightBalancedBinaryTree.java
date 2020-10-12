package personal.programming.algos.trees;

public class HeightBalancedBinaryTree {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
            left=null;
            right=null;
        }
    }



    public int isBalanced(TreeNode A) {
        if (A.left == null && A.right == null) {
            return 1;
        }
        if (A.left == null) {
            if (A.right.left != null || A.right.right != null) {
                return 0;
            }
            return 1;
        }
        if (A.right == null) {
            if (A.left.left != null || A.left.right != null) {
                return 0;
            }
            return 1;
        }
        if (isBalanced(A.left) == 0) {
            return 0;
        }
        if (isBalanced(A.right) == 0) {
            return 0;
        }
        return 1;
    }
}
