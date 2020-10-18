package personal.programming.algos.trees;

public class FlattenBinaryTreeToLinkedList {

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

    public TreeNode flatten(TreeNode a) {
        if(a==null){
            return null;
        }
        TreeNode  left = a.left;
        TreeNode right = a.right;
        TreeNode temp=a;
        a.left=null;
        a.right=null;
        if(left!=null)
            a.right = flatten(left);
        if(right!=null){
            while(temp.right!=null){
                temp=temp.right;
            }
            temp.right = flatten(right);
        }
        return a;

    }
}
