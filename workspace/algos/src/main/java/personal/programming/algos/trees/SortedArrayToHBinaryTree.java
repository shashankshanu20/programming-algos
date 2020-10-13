package personal.programming.algos.trees;

public class SortedArrayToHBinaryTree {

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



    public TreeNode sortedArrayToBST(final int[] A) {

        if(A.length==1)
            return new TreeNode(A[0]);

        TreeNode root = getRootNode(A, 0,A.length-1);
        return root;
    }

    public TreeNode getRootNode(int []A, int start, int end){
        if(start > end)
            return null;
        int mid = ( start+end) / 2;
        if(mid<A.length){
            TreeNode temp = new TreeNode(A[mid]);
            temp.left = getRootNode(A,start,mid-1);
            temp.right = getRootNode(A,mid+1,end);
            return temp;
        }
        return null;
    }
}
