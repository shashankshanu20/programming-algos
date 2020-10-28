package personal.programming.algos.dynamicprogramming;

public class MaxPathSum {

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

    public int maxPathSum(TreeNode A) {
        int sum = traverse(A);
        return Math.max(maxPathSum, sum);
    }

    int maxPathSum = Integer.MIN_VALUE;

    public int traverse(TreeNode root){
        if (root == null) {
          return 0;
        }
        int leftSum = traverse(root.left);
        int rightSum = traverse(root.right);
        maxPathSum = Math.max(maxPathSum, root.val);
        maxPathSum = Math.max(maxPathSum, leftSum+root.val+rightSum);
        return Math.max(leftSum, rightSum)+(root.val);
    }
}
