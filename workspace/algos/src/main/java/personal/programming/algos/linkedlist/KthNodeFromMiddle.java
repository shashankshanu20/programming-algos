package personal.programming.algos.linkedlist;

public class KthNodeFromMiddle {

    public static void main(String []args){
        ListNode ss = new ListNode(630 );
        ListNode ref = ss;
        ss.next = new ListNode(624 );
        ss = ss.next;
        ss.next = new ListNode(85 );
        ss = ss.next;
        ss.next = new ListNode(955 );
        ss = ss.next;
        ss.next = new ListNode(757 );
        ss = ss.next;
        ss.next = new ListNode(841 );
        ss = ss.next;
        ss.next = new ListNode(967   );
        ss = ss.next;
        ss.next = new ListNode(377 );
        ss = ss.next;
        ss.next = new ListNode(932 );
        ss = ss.next;
        System.out.println(solve(ref,2));
    }

    private static class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
    }


//    public static int solve(ListNode A, int B) {
    public static int solve(ListNode A, int B) {

        ListNode slow=A;
        ListNode fast=A;
        int count  = 1;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            count++;
        }

        if(fast!=null&&fast.next!=null){
            slow =slow.next;
            count++;
        }

        if(B>=count){
            return -1;
        }

        int iterationCount  = 1;
        ListNode currentNode = A;
        while(iterationCount<count){
            if(iterationCount==count-B){
                break;
            }
            iterationCount++;
            currentNode = currentNode.next;
        }
        return currentNode.val;
    }
}
