package personal.programming.algos.trees;

import java.util.ArrayList;

public class KthSmallestElement {

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

    public int kthsmallest(TreeNode A, int B) {
        ArrayList<Integer> nodes = new ArrayList<>();
        inOrder(A, B, nodes);
        return nodes.get(B-1);
    }


    private void inOrder(TreeNode A, int B, ArrayList<Integer> nodes) {

        if(A != null && A.left == null && A.right == null) {
            nodes.add(A.val);
            return;

        }
        if(A.left != null) {
            inOrder(A.left, B, nodes);
        }
        if(nodes.size() >= B) {
            return;
        }
        nodes.add(A.val);
        if(nodes.size() >= B) {
            return;
        }
        if(A.right != null) {
            inOrder(A.right, B, nodes);
        }
        return ;
    }
}
