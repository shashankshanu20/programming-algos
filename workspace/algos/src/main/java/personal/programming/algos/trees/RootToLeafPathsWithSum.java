package personal.programming.algos.trees;

import java.util.ArrayList;

public class RootToLeafPathsWithSum {

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

    public ArrayList<ArrayList<Integer>> pathSum(TreeNode A, int B) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        calculator(A, B, 0, result, new ArrayList<>());
        return result;
    }

    public void calculator(TreeNode root, int sum, int currentSum, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> currentArray){
        if(root==null){
            return;
        }
        currentArray.add(root.val);
        if(root.val+currentSum == sum && root.left == null && root.right == null){
            result.add(currentArray);
            return;
        }
        calculator(root.left,sum, currentSum+root.val, result, new ArrayList<>(currentArray));
        calculator(root.right,sum, currentSum+root.val, result, new ArrayList<>(currentArray));
    }
}
