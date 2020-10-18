package personal.programming.algos.trees;

import java.util.ArrayDeque;
import java.util.Queue;

public class PopulateRightNodePointers {

    public class TreeLinkNode {
          int val;
          TreeLinkNode left, right, next;
          TreeLinkNode(int x) {
              val = x;
          }
    }

    public void connect(TreeLinkNode root) {
        Queue<TreeLinkNode> parentQueue = new ArrayDeque<>();
        Queue<TreeLinkNode> siblingsQueue = new ArrayDeque<>();
        parentQueue.add(root);
        while (!parentQueue.isEmpty()){
            TreeLinkNode lastPop = parentQueue.poll();
            if(lastPop.left!=null){
                siblingsQueue.add(lastPop.left);
            }
            if(lastPop.right!=null){
                siblingsQueue.add(lastPop.right);
            }
            if(parentQueue.isEmpty()){
                lastPop.next = null;
                parentQueue.addAll(siblingsQueue);
                siblingsQueue.clear();
            }else{
                lastPop.next = parentQueue.peek();
            }
        }
    }
}
