package personal.programming.algos.trees;

public class MinDepthBinaryTree {

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
    int minDepth = Integer.MAX_VALUE;
    public int minDepth(TreeNode A) {
        calculateDepth(A,0);
        return minDepth;
    }

    public void calculateDepth(TreeNode root, int currentDepth){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            minDepth = Math.min(currentDepth+1,minDepth);
        }
        calculateDepth(root.left, currentDepth+1);
        calculateDepth(root.right, currentDepth+1);
    }
}
