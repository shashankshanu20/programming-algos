package personal.programming.algos.trees;

public class RemoveHalfNodes {

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

    public TreeNode solve(TreeNode A) {
        return inOrder(A);
    }

    public TreeNode inOrder(TreeNode root){
        if(root==null){
            return root;
        }
        inOrder(root.right);
        if((root.left==null&&root.right!=null)){
            return inOrder(root.right);
        }else if(root.left!=null&&root.right==null){
            return inOrder(root.left);
        }else if(root.right!=null&&root.left!=null){
            root.left = inOrder(root.left);
            root.right = inOrder(root.right);
            return root;
        }else {
            return root;
        }
    }
}
