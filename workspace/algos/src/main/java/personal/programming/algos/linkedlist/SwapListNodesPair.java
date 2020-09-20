package personal.programming.algos.linkedlist;

public class SwapListNodesPair {

    public static void main(String []args){

    }

    private class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
    }


    public ListNode swapPairs(ListNode A) {
        ListNode copyA = A;
        if(copyA==null||copyA.next==null){
            return A;
        }
        while (copyA!=null){
            if(copyA.next!=null){
                int temp=copyA.val;
                copyA.val=copyA.next.val;
                copyA.next.val=temp;
                copyA = copyA.next.next;
            }else{
                break;
            }

        }
        return A;
    }
}
