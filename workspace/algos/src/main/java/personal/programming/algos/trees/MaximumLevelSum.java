package personal.programming.algos.trees;

import java.util.*;

public class MaximumLevelSum {

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

    public int solve(TreeNode A) {
//        Queue<TreeNode> queue = new ArrayDeque<>();
//        int maxSum = Integer.MIN_VALUE;
//        int sum = 0;
//        queue.add(A);
//        queue.add(null);
//        while (!queue.isEmpty()||queue.size()==1&&queue.peek()!=null){
//            TreeNode temp = queue.poll();
//            sum += temp.val;
//
//            if(temp.left!=null){
//                queue.add(temp.left);
//            }
//            if(temp.right!=null){
//                queue.add(temp.right);
//            }
//
//            if(queue.peek()==null){
//                maxSum = Math.max(maxSum, sum);
//                sum = 0;
//                queue.poll();
//                if(queue.size()>0){
//                    queue.add(null);
//                }
//            }
//        }
//        return maxSum;
        List<Integer> result = new ArrayList<>();
        for(int i = 1;i<=20;i++){
            result.add(0);
        }
        helper(A,0,result);
        Collections.sort(result,Collections.reverseOrder());
        return result.get(0);
    }

    void helper(TreeNode root, int level, List<Integer> result)
    {
        if(root==null)
            return;

        result.set(level, result.get(level) + root.val);
        helper(root.left,level+1,result);
        helper(root.right,level+1,result);
    }
}
