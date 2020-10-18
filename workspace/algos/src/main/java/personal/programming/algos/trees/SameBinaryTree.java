package personal.programming.algos.trees;

public class SameBinaryTree {


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

    public int isSameTree(TreeNode A, TreeNode B) {
        if(A==null&&B==null){
            return 1;
        }else if(A==null&&B!=null||A!=null&&B==null){
            return 0;
        }
        if(A.val!=B.val){
            return 0;
        }
        int returnVal = isSameTree(A.left,B.left);
        if(returnVal==1){
            returnVal = isSameTree(A.right,B.right);
        }
        return returnVal;
    }
}
