package personal.programming.algos.linkedlist;

public class Lpallindrome {

    private class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
    }

    public int lPalin(ListNode A) {
        int length  = calculateLength(A);
        ListNode current = A;
        if (length < 2) {
            return 1;
        }
        int half = length / 2;
        for (int i = 0; i < half - 1; i++) {
            current = current.next;
        }
        ListNode reverseHead = reverseList(current.next);
        current.next = null;
        for (int i = 0; i < half; i++) {
            if (A.val != reverseHead.val) return 0;
            A = A.next;
            reverseHead = reverseHead.next;
        }
        return 1;
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

    public int calculateLength(ListNode a){
        int length = 0;
        ListNode listNodeLenCal= a;
        while(listNodeLenCal!=null){
            listNodeLenCal = listNodeLenCal.next;
            length++;
        }
        return length;
    }
}
