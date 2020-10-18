package personal.programming.algos.trees;

public class SymmetricTree {

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

    public int isSymmetric(TreeNode A) {
        return isMirrorTree(A.left,A.right);
    }

    public int isMirrorTree(TreeNode A, TreeNode B) {
        if(A==null&&B==null){
            return 1;
        }else if(A==null&&B!=null||A!=null&&B==null){
            return 0;
        }
        if(A.val!=B.val){
            return 0;
        }
        int returnVal = isMirrorTree(A.left,B.right);
        if(returnVal==1){
            returnVal = isMirrorTree(A.right,B.left);
        }
        return returnVal;
    }
}
