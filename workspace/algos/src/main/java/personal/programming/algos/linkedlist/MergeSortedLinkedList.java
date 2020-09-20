package personal.programming.algos.linkedlist;

public class MergeSortedLinkedList {

    private class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
    }

    public static void main(String []args){

    }

    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode temp = new ListNode(0);
        ListNode result = temp;
        while(A!=null&&B!=null){
            if(A.val<B.val){
                temp.next =A;
                A = A.next;
            }else{
                temp.next =B;
                B = B.next;
            }
            temp = temp.next;
        }
        if(B==null){
            temp.next = A;
        }
        if(A==null){
            temp.next = B;
        }
        return result.next;
    }
}
