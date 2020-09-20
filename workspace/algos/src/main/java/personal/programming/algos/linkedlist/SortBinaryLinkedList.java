package personal.programming.algos.linkedlist;

public class SortBinaryLinkedList {

    public static void main(String []args){

    }

    private class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
    }

    public ListNode solve(ListNode A) {
        int zero=0, one=0;
        ListNode current = A;
        while(current!=null){
            if(current.val==0)  {
                zero++;
            }
            else{
                one++;
            }
            current=current.next;
        }

        current=A;
        while(zero>0){
            current.val=0;
            current=current.next;
        }
        while(one>0){
            current.val=0;
            current=current.next;
        }
        return A;
    }
}
