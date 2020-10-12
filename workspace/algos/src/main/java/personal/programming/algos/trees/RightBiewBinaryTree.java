package personal.programming.algos.trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RightBiewBinaryTree {

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

    public ArrayList<Integer> solve(TreeNode A) {
        Map<Integer, Integer> map = new HashMap<>();
        helper(A,map,0);
        ArrayList<Integer>result = new ArrayList<>();
        map.values().stream().forEach(m->result.add(m));
        return result;
    }

    public void helper(TreeNode root , Map<Integer,Integer> map, int level){
        if(root==null)
            return;
        map.put(level, root.val);
        helper(root.left,map,level+1);
        helper(root.right,map,level+1);
    }

}
