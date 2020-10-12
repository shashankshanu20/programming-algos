package personal.programming.algos.trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class VerticalOrderTraversalBinaryTree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
            left=null;
            right=null;
        }
    }

    public static void main(String []args){
        TreeNode A = new TreeNode(8262);
        A.right = new TreeNode(411);
//        System.out.println(verticalOrderTraversal(A));
    }

//    public static ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {
//        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
//        preOrder(A,0,map);
//        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
//        result.addAll(map.values());
//        return result;
//    }
//
//    public static void preOrder(TreeNode root, int index, TreeMap<Integer, ArrayList<Integer>> map){
//        if(root==null){
//            return;
//        }
//        ArrayList<Integer> arr= map.containsKey(index)?map.get(index):new ArrayList<>();
//        arr.add(root.val);
//        map.put(index, arr);
//        preOrder(root.left, index-1, map);
//        preOrder(root.right, index+1, map);
//    }
    HashMap<Integer, ArrayList> map = new HashMap<>();
    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int h =height(A);
        for (int i = 0; i <= h ;i++) {
            fillList(A, 0, i);

        }
        Object[] keys = map.keySet().toArray();
        Arrays.sort(keys);
        for (Object value : keys) {
            list.add(map.get(value));
        }
        return list;
    }

    int height(TreeNode root) {
        if (root == null)
            return 0;
        else
        {
            int lheight = height(root.left);
            int rheight = height(root.right);

            if (lheight > rheight)
                return(lheight+1);
            else return(rheight+1);
        }
    }

    public void fillList(TreeNode currNode, int Hlevel, int Vlevel) {
        if (currNode == null)
            return;
        if (Vlevel == 1)
            insert(currNode.val, Hlevel);
        else if (Vlevel > 1)  {
            fillList(currNode.left, Hlevel-1, Vlevel-1);
            fillList(currNode.right,Hlevel+1, Vlevel-1);
        }
    }

    public void insert(int val, int level) {
        ArrayList<Integer> temp;
        if (map.containsKey(level)) {
            temp = map.get(level);
        } else {
            temp = new ArrayList<Integer>();
        }
        temp.add(val);
        map.put(level, temp);
    }
}
