package personal.programming.algos.trees;

import java.util.ArrayList;

public class PreOrderTRaversal {

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

    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        ArrayList<Integer> result = new ArrayList<>();
        preOrder(A, result);
        return result;
    }

    public void preOrder(TreeNode root, ArrayList<Integer> result){
        if(root==null){
            return;
        }
        result.add(root.val);
        preOrder(root.left, result);
        preOrder(root.right, result);
    }
}
