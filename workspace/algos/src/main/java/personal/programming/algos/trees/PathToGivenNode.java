package personal.programming.algos.trees;

import java.util.ArrayList;

public class PathToGivenNode {

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



    public ArrayList<Integer> solve(TreeNode A, int B) {
        ArrayList<Integer> result = new ArrayList<>();
        find(A,B,result);
        return result;
    }

    public boolean  find(TreeNode root, int n, ArrayList<Integer> result ){
        if(root == null)
            return false;
        result.add(root.val);
        if(root.val == n)
            return true;
        if(find(root.left,n,result) || find(root.right,n,result))
            return true;
        result.remove(result.size() -1);
        return false;
    }
}
