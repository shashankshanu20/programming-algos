package personal.programming.algos.linkedlist;

public class RemoveNthNodeFromEnd {
    private class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
    }


    public ListNode removeNthFromEnd(ListNode A, int B) {
        ListNode acopy = A;
        Boolean removed = Boolean.FALSE;
        int counter = 0;
        if(A==null){
            return A;
        }
        int length = calculateLength(acopy);
        if(B>=length){
            A = A.next;
            return A;
        }else{
            while (!removed){

                if(length-1==B){
                    acopy.next = acopy.next.next;
                    removed = Boolean.TRUE;
                }else{
                    acopy = acopy.next;
                }

                length--;

            }
        }

        return A;
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
