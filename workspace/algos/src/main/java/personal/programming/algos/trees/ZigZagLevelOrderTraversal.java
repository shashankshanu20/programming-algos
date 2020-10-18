package personal.programming.algos.trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;

public class ZigZagLevelOrderTraversal {

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

    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> arr=new ArrayList<>();
        if(A==null){
            return result;
        }
        Queue<TreeNode> queue=new ArrayDeque<>();
        TreeNode ODD=new TreeNode(Integer.MIN_VALUE);
        TreeNode EVEN=new TreeNode(Integer.MAX_VALUE);

        queue.add(A);
        queue.add(ODD);

        while(!queue.isEmpty()){
            TreeNode front=queue.remove();

            if(front==ODD){
                result.add(new ArrayList<>(arr));

                if(!queue.isEmpty()){
                    queue.add(EVEN);
                }
                arr.clear();
            }
            else if(front==EVEN){
                Collections.reverse(arr);
                result.add(new ArrayList<>(arr));

                if(!queue.isEmpty()){
                    queue.add(ODD);
                }
                arr.clear();
            }
            else if(front!=EVEN && front!=ODD){
                arr.add(front.val);
            }
            if(front.left!=null){
                queue.add(front.left);
            }
            if(front.right!=null){
                queue.add(front.right);
            }
        }
        return result;
    }

}
