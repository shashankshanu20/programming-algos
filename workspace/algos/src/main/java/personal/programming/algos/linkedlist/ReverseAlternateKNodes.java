package personal.programming.algos.linkedlist;

public class ReverseAlternateKNodes {

    public static void main(String []args){

    }

    private class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
    }

    public ListNode solve(ListNode A, int B) {
        if(A==null)
            return null;

        ListNode current=A,previous=null, next=A;
        int i=1;
        while(i<=B&&current!=null)
        {
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
            i++;
        }

        A.next=next;
        i=1;
        while(i<B&&current!=null)
        {
            current=current.next;
            i++;
        }

        if(current!=null)
            current.next=solve(current.next,B);

        return previous;
    }
}
