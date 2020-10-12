package personal.programming.algos.trees;

public class PathSum {

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

    public int hasPathSum(TreeNode A, int B) {
        return preOrder(A,0,B);
    }


    public int preOrder(TreeNode root, int sum, int target){
        if(root==null){
            return 0;
        }
        sum+=root.val;
        if(root.left==null&root.right==null){
            if(sum==target){
                return 1;
            }
        }
        return Math.max(preOrder(root.left, sum, target),preOrder(root.right, sum, target));
    }
}
