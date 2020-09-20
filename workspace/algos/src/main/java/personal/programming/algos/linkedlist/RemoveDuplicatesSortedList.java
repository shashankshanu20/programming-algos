package personal.programming.algos.linkedlist;

public class RemoveDuplicatesSortedList {

    private class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
    }

    public ListNode deleteDuplicates(ListNode A) {
        ListNode acopy = A;

        while (acopy!=null){
            if(acopy.next==null){
                acopy = acopy.next;

            }else{
                if(acopy.next.val == acopy.val){
                    acopy.next = acopy.next.next;
                }else{
                    acopy = acopy.next;
                }
            }
        }

        return A;
    }
}
