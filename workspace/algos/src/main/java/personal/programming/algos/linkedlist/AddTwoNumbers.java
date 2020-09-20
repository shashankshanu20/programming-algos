package personal.programming.algos.linkedlist;

public class AddTwoNumbers {

    public static void main(String []args){
        System.out.println(10/10);
        System.out.println(10%10);
    }

    private class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
    }


    public ListNode addTwoNumbers(ListNode A, ListNode B) {
        ListNode copyA = A;
        ListNode copyB = B;
        ListNode sumNode = new ListNode(0);
        ListNode result = sumNode;
        int carry = 0;
        while (copyA!=null&&copyB!=null){
            int sum = copyA.val+copyB.val+carry;
            sumNode.next = new ListNode(sum%10);
            copyA = copyA.next;
            copyB = copyB.next;
            carry = sum/10;
            sumNode = sumNode.next;
        }
        while(copyA!=null){
            int sum = copyA.val+carry;
            sumNode.next = new ListNode(sum%10);
            copyA = copyA.next;
            carry = sum/10;
            sumNode = sumNode.next;
        }
        while(copyB!=null){
            int sum = copyB.val+carry;
            sumNode.next = new ListNode(sum%10);
            copyB = copyB.next;
            carry = sum/10;
            sumNode = sumNode.next;
        }
        if(carry!=0){
            while(carry!=0){
                sumNode.next = new ListNode(carry%10);
                carry/=10;
                sumNode = sumNode.next;
            }
        }
        return result.next ;
    }
}
