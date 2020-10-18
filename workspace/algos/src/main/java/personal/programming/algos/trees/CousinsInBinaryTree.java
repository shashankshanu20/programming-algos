package personal.programming.algos.trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class CousinsInBinaryTree {

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

    public ArrayList<Integer> solve(TreeNode A, int B) {
        ArrayList<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        if(A!=null){
            queue.add(A);
        }
        boolean isFound = Boolean.FALSE;
        while(!queue.isEmpty()){
            boolean foundOnlevel = Boolean.FALSE;
            while(queue.size()>0){
                TreeNode temp=queue.remove();
                if(isFound){
                    result.add(temp.val);
                    continue;
                }
                if((temp.left!=null&&temp.left.val==B)||(temp.right!=null&&temp.right.val==B)){
                    foundOnlevel = Boolean.TRUE;
                }else{
                    if(temp.left!=null){
                        queue.add(temp.left);
                    }

                    if(temp.right!=null){
                        queue.add(temp.right);
                    }
                }
            }
            isFound=foundOnlevel;
        }
        return result;
    }
}
