package personal.programming.algos.trees;

public class NextGreaterNumberBST {

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

    public TreeNode getSuccessor(TreeNode a, int b) {
        TreeNode lastTop = null;
        TreeNode temp = a;
        while(temp!=null){
            if(temp.val > b){
                lastTop = temp;
                temp = temp.left;
            }
            else{
                temp = temp.right;
            }
        }
        return lastTop;
    }
}
