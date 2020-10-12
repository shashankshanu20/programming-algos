package personal.programming.algos.trees;

import java.util.ArrayDeque;
import java.util.Queue;

public class LevelOrderTraversal {
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


    /**
     * using queue
     *
     * */
    public void levelOrderUsingQueue(TreeNode root){
        Queue<TreeNode> treeNodeQueue = new ArrayDeque<>();
        treeNodeQueue.add(root);
        while(!treeNodeQueue.isEmpty()){
            TreeNode node = treeNodeQueue.poll();
            System.out.println(node.val);
            if(node.left!=null){
                treeNodeQueue.add(node.left);
            }
            if(node.right!=null){
                treeNodeQueue.add(node.right);
            }
        }
    }

    /**
     * by not using queue
     *
     * */
    public void levelOrderWithoutQueue(TreeNode root){
        int h = height(root);
        int i;
        for (i=1; i<=h; i++)
            printGivenLevel(root, i);
    }

    public int height(TreeNode root)
    {
        if (root == null)
            return 0;
        else
        {
            /* compute  height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);

            /* use the larger one */
            if (lheight > rheight)
                return(lheight+1);
            else return(rheight+1);
        }
    }

    public void printGivenLevel (TreeNode root ,int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.val + " ");
        else if (level > 1)
        {
            printGivenLevel(root.left, level-1);
            printGivenLevel(root.right, level-1);
        }
    }
}
