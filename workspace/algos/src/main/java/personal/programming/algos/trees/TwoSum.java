package personal.programming.algos.trees;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TwoSum {
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

    Boolean isFound = Boolean.FALSE;
    public int t2Sum(TreeNode A, int B) {
        inOrder(A, new HashMap<>(),B);
        return isFound?1:0;
    }

    public void inOrder(TreeNode root, Map<Integer,Integer> map, int B){
        if(root==null){
            return;
        }
        inOrder(root.left,map,B);
        if(map.containsKey(B-root.val)){
            isFound = Boolean.TRUE;
        }else{
            map.put(root.val,1);
        }
        inOrder(root.right,map,B);
    }
}
