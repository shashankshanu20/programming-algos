package personal.programming.algos.trees;

import java.util.ArrayList;

public class LeastCommonAncestor {

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

//    ArrayList<Integer> btracker = new ArrayList<>();
//    ArrayList<Integer> ctracker = new ArrayList<>();
//
//    public int lca(TreeNode A, int B, int C) {
//       pathTracker(A, B, btracker);
//       pathTracker(A, C, ctracker);
//       if(btracker.isEmpty()||ctracker.isEmpty()){
//           return -1;
//       }
//       for(Integer b:btracker){
//           for(Integer c:ctracker){
//               if(b==c){
//                   return b;
//               }
//           }
//       }
//       return -1;
//    }
//
//    public boolean pathTracker(TreeNode root, int val, ArrayList<Integer> trackerArray){
//        if(root==null){
//            return Boolean.FALSE;
//        }
//        if(root.val==val){
//            trackerArray.add(root.val);
//            return Boolean.TRUE;
//        }
//        if(pathTracker(root.left, val, trackerArray)){
//            trackerArray.add(root.val);
//            return Boolean.TRUE;
//        }
//        if(pathTracker(root.right, val, trackerArray)){
//            trackerArray.add(root.val);
//            return Boolean.TRUE;
//        }
//        return Boolean.FALSE;
//    }
    public int lca(TreeNode root, int n1, int n2) {
        if(existenceCheck(root,n1)&&existenceCheck(root,n2)){
            return pathTracker(root,n1,n2).val;
        }
        return -1;
    }
    public TreeNode pathTracker(TreeNode root, int n1, int n2){
        if(root==null||root.val==n1||root.val==n2)
            return root;
        TreeNode left=pathTracker(root.left,n1,n2);
        TreeNode right=pathTracker(root.right,n1,n2);
        if(left!=null&&right!=null)
            return root;
        return left!=null?left:right;
    }

    public boolean existenceCheck(TreeNode root,int x){
        if(root==null){
            return false;
        }
        if(root.val==x){
            return true;
        }
        return (existenceCheck(root.left,x)||existenceCheck(root.right,x));
    }

}
