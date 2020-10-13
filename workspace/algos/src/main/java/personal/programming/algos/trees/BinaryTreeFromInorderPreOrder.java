package personal.programming.algos.trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BinaryTreeFromInorderPreOrder {

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

    int index = 0;

    public TreeNode buildTree(ArrayList<Integer> A, ArrayList<Integer> B) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<B.size();i++)
            map.put(B.get(i),i);

        return constructTree(A, map,0,A.size()-1);
    }

    public TreeNode constructTree(ArrayList<Integer> A, Map<Integer, Integer> map, int start, int end){
        if(start>end){
            return null;
        }
        TreeNode root = new TreeNode(A.get(index++));
        if(start==end){
            return root;
        }
        int index = map.get(root.val);
        root.left = constructTree(A, map, start, index-1);
        root.right = constructTree(A, map,index+1, end);
        return root;
    }
}
