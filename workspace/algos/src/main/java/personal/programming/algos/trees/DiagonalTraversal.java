package personal.programming.algos.trees;

import java.util.*;

public class DiagonalTraversal {

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
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>(Collections.reverseOrder());
        ArrayList<Integer> result = new ArrayList<>();
        preOrder(A,map,0);
        map.values().stream().forEach(v->result.addAll(v));
        return result;
    }

    public void preOrder(TreeNode root, Map<Integer, ArrayList<Integer>> map, int slope){
        if(root==null){
            return;
        }
        if(map.containsKey(slope)){
            ArrayList<Integer> arr = map.get(slope);
            arr.add(root.val);
            map.put(slope,arr);
        }else{
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(root.val);
            map.put(slope,arr);
        }
        preOrder(root.left, map, slope-1);
        preOrder(root.right, map, slope);
    }
}
