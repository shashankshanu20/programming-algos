package personal.programming.algos.trees;

import java.util.ArrayList;
import java.util.Stack;

public class InorderTraversalCartesianTree {

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

    public TreeNode buildTree(ArrayList<Integer> A) {
        if (A.isEmpty()) {
            return null;
        }
        Stack<TreeNode> peeks = new Stack<>();
        TreeNode root = new TreeNode(A.get(0));
        for (int i = 1; i < A.size(); i++) {
            TreeNode current = new TreeNode(A.get(i));
            if (current.val > A.get(i - 1)) {
                while (!peeks.isEmpty() && current.val > peeks.peek().val) {
                    root = peeks.pop();
                }
                if (!peeks.isEmpty()) {
                    peeks.peek().right = current;
                }
                current.left = root;
                root = current;
            } else {
                peeks.push(root);
                root.right = current;
                root = current;
            }
        }

        while (!peeks.isEmpty()) {
            peeks.peek().right = root;
            root = peeks.pop();
        }

        return root;
    }

}
