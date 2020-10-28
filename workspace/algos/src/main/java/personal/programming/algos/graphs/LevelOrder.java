package personal.programming.algos.graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;


public class LevelOrder {
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

    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(A);
        while(!queue.isEmpty()){
            int size=queue.size();
            ArrayList<Integer> tempArr= new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode front=queue.poll();
                tempArr.add(front.val);
                if(front.left!=null)
                {
                    queue.add(front.left);
                }
                if(front.right!=null)
                {
                    queue.add(front.right);
                }
            }
            result.add(tempArr);
        }
        return result;
    }
}
