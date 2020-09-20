package personal.programming.algos.linkedlist;

public class EvenReverse {
    public static void main(String []args){

    }

    private class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
    }

    public ListNode solve(ListNode A) {
        if(A==null||A.next==null||A.next.next==null||A.next.next.next==null){
            return A;
        }


        ListNode odd=A;
        ListNode even=A.next;
        ListNode oddHead = odd;
        ListNode evenHead = even;
        while(even != null && even.next != null)
        {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = null;
        ListNode reverseEvenHead = reverseList(evenHead);
        ListNode l1 = oddHead;
        ListNode l2 = reverseEvenHead;
        ListNode next = null;
        while(l2 != null)
        {
            next = l2.next;
            l2.next = l1.next;
            l1.next = l2;
            l1 = l2.next;
            l2 = next;
        }

        return oddHead;


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
