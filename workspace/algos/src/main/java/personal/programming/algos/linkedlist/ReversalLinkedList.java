package personal.programming.algos.linkedlist;

public class ReversalLinkedList {

    private class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
    }

    public ListNode reverseList(ListNode A) {
        ListNode reverse = null;
        while(A!=null){
            ListNode listNode = new ListNode(A.val );
            listNode.next = reverse;
            reverse = listNode;
            A = A.next;
        }
        return reverse;
    }
}
