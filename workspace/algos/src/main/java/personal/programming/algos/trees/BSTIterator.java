package personal.programming.algos.trees;

import java.util.ArrayDeque;
import java.util.Queue;

public class BSTIterator {

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
    class Solution {

    Queue<Integer> queue = new ArrayDeque<>();

    public Solution(TreeNode root) {
        inOrder(root);
    }

    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        queue.add(root.val);
        inOrder(root.right);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return queue.isEmpty()?Boolean.FALSE:Boolean.TRUE;
    }

    /** @return the next smallest number */
    public int next() {
        return queue.poll();
    }

    }
}
