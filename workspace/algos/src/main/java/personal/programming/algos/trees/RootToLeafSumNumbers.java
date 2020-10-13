package personal.programming.algos.trees;

import java.util.ArrayList;

public class RootToLeafSumNumbers {

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
    int total = 0;
    public int sumNumbers(TreeNode A) {
        calculateSum(A, 0);
        return total;
    }

    public void calculateSum(TreeNode root, int num){
        if(root==null){
            return;
        }
        num = num*10+root.val;
        if(root.left==null&&root.right==null){
            total = (total+num)%1003;
        }
        calculateSum(root.left, num);
        calculateSum(root.right, num);
    }
}
