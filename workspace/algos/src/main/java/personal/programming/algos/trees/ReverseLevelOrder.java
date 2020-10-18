package personal.programming.algos.trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;

public class ReverseLevelOrder {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
            left=null;
            right=null;
        }
    }

    public static void main(String []args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.right = new TreeNode(7);
        root.right.left = new TreeNode(15);
        solve(root);
    }


    public static ArrayList<Integer> solve(TreeNode A) {
        ArrayList<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(A);
        while (!queue.isEmpty()){
            TreeNode temp = queue.poll();
            if(temp!=null){
                result.add(0,temp.val);
                if(temp.right!=null){
                    queue.add(temp.right);
                }
                if(temp.left!=null){
                    queue.add(temp.left);
                }
            }
        }
        Collections.reverse(result);
        return result;
    }

}
