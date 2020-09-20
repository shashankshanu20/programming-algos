package personal.programming.algos.linkedlist;

public class ReverseKLinkedList {

    public static void main(String []args){

    }

    private class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
    }

    public ListNode reverseList(ListNode A, int B) {
        if(null == A || null == A.next || B < 2){
            return A;
        }
        ListNode previousNode = null;
        ListNode currentNode = A;
        int count = 0;
        while(count++ < B && null != currentNode){
            ListNode next = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = next;
        }
        A.next = reverseList(currentNode, B);
        return previousNode;
    }
}
