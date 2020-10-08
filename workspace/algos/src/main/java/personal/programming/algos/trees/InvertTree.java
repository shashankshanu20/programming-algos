package personal.programming.algos.trees;

public class InvertTree {

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

    public TreeNode invertTree(TreeNode A) {
        TreeNode head = A;
        inOrder(A);
        return head;
    }

    private void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        inOrder(root.left);
        inOrder(root.right);
    }
}
