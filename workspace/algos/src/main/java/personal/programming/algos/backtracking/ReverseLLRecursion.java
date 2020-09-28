package personal.programming.algos.backtracking;

public class ReverseLLRecursion {

    private class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
    }

    public ListNode reverseList(ListNode head)  {
        if(head == null) {
            return head;
        }
        if(head.next == null) {
            return head;
        }
        ListNode newHeadNode = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHeadNode;
    }
}
