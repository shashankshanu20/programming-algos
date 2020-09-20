package personal.programming.algos.linkedlist;

import java.util.List;

public class RotateList {
    public static void main(String []args){

    }

    private class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
    }

    public ListNode rotateRight(ListNode A, int B) {

        int length=calculateLength(A);
        if(length>1){
            ListNode copyA = A;
            ListNode head = A;
            for (int i = 1; i<length-B;i++){
                copyA = copyA.next;
            }
            ListNode newHead = copyA.next;
            copyA.next = null;
            ListNode copyNewHead = newHead;
            while(copyNewHead.next!=null){
                copyNewHead = copyNewHead.next;
            }
            copyNewHead.next = head;
            return newHead;
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
