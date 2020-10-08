package personal.programming.algos.trees;

public class ValidBST {

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

    public int isValidBST(TreeNode A) {
        return isBST(A,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    public int isBST(TreeNode A,int min,int max){
        if(A==null)
            return 1;
        if(A.val>max||A.val<min)
            return 0;
        return (isBST(A.left,min,A.val-1)==1)&&(isBST(A.right,A.val+1,max)==1)?1:0;
    }



}
