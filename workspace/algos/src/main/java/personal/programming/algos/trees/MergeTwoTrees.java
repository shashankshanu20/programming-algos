package personal.programming.algos.trees;

public class MergeTwoTrees {

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


    public TreeNode solve(TreeNode A, TreeNode B) {
        if(A==null && B==null)
        {
            return null;
        }
        if(A==null)
        {
            return B;
        }

        if(B==null)
        {
            return A;
        }
        if(A!=null && B!=null)
        {
            A.val+=B.val;
            A.left=solve(A.left,B.left);
            A.right=solve(A.right,B.right);
        }
        return A;
    }


}
