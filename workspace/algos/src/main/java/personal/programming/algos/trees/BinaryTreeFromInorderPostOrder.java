package personal.programming.algos.trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BinaryTreeFromInorderPostOrder {

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

    int preIndex = 0;

    public TreeNode buildTree(ArrayList<Integer> A, ArrayList<Integer> B) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<A.size();i++)
            map.put(A.get(i),i);

        ArrayList<Integer> reversePost = new ArrayList<>(B.size());
        for(int i=0;i<B.size();i++){
            reversePost.add(B.get(B.size()-1-i));
        }
        return constructTree(A,reversePost, map,0,A.size()-1);

    }

    public TreeNode constructTree(ArrayList<Integer> A, ArrayList<Integer> reversePost, Map<Integer,Integer> map, int start, int end){
        if(start>end){
            return null;
        }
        TreeNode root = new TreeNode(reversePost.get(preIndex++));
        if(start==end){
            return root;
        }
        int index = map.get(root.val);
        root.right = constructTree(A,reversePost,map,index+1,end);
        root.left = constructTree(A,reversePost,map,start,index-1);
        return root;
    }
}
