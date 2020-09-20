package personal.programming.algos.linkedlist;

public class MergeSortLinkedList {
    public static void main(String []args){

    }

    private class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
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

    public ListNode sortList(ListNode A) {
        if (A == null || A.next == null){
            return A;
        }
        ListNode oneStepper  = A;
        ListNode twoStepper = A.next;
        while (twoStepper.next != null && twoStepper.next.next != null) {
            twoStepper = twoStepper.next.next;
            oneStepper = oneStepper.next;
        }
        ListNode newHead = oneStepper.next;
        oneStepper.next = null;
        return merge(sortList(A), sortList(newHead));
    }

    public ListNode merge(ListNode ll1, ListNode ll2) {
        ListNode temp = new ListNode(Integer.MIN_VALUE);
        ListNode current  = temp;
        while(ll1 != null && ll2 != null) {
            if (ll1.val < ll2.val) {
                current.next = ll1;
                ll1 = ll1.next;
            } else {
                current.next = ll2;
                ll2 = ll2.next;
            }
            current = current.next;
        }
        if (ll1 == null) {
            current.next = ll2;
        }else {
            current.next = ll1;
        }
        return temp.next;
    }

}
