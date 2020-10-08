package personal.programming.algos.trees;

import java.util.ArrayList;
import java.util.Collections;

public class RecoverBinaryTree {

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

    int firstNum = Integer.MIN_VALUE;
    int secondNum = Integer.MIN_VALUE;
    int thirdNum = Integer.MIN_VALUE;

    ArrayList<Integer> result = new ArrayList<>();
    public ArrayList<Integer> recoverTree(TreeNode A) {
        inOrder(A);
        if(result.size()==1)
            result.add(thirdNum);
        Collections.reverse(result);
        return result;
    }

    public void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        firstNum = secondNum;
        secondNum = thirdNum;
        thirdNum = root.val;
        if((secondNum>firstNum && secondNum>thirdNum) || (secondNum<firstNum && secondNum<thirdNum)){
            if(result.size()==2)
                result.set(1, secondNum);
            else
                result.add(secondNum);
        }
        inOrder(root.right);
    }
}
