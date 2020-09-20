package personal.programming.algos.linkedlist;

public class ReorderList {

    private class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
    }

    public static void main(String []args){
        int N = 12;
        int  i = 1;
        int []arr= {0,0};
        while(i<N){
            String str = "";
            if(!String.valueOf(i).contains("0")&&!String.valueOf(N-i).contains("0")){
                arr[0] = i;
                arr[1] = N-i;
                break;
            }
            i++;
        }
        System.out.println(arr);
    }

    public static int calculateSumOfDigits(int N){
        int sum = 0 ;
        while(N>0){
            sum += N%10;
            N = N/10;
        }
        return sum;
    }

    public ListNode reorderList(ListNode A) {
            int size = calculateLength(A);
            if(size <= 2) { // No need to operate in this case
                return A;
            }
            ListNode copyA = A;
            int i = 0;
            //iterate till mid node
            while (i < size / 2) {
                copyA = copyA.next;
                i++;
            }
            ListNode reverseList = reverseList(copyA.next);
            copyA.next = null;
            copyA = A;

            while (reverseList != null) {
                ListNode temp = reverseList;
                reverseList = reverseList.next;
                temp.next = copyA.next;
                copyA.next = temp;

                copyA = copyA.next.next;
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

    static ListNode reverseList(ListNode mid)
    {
        ListNode copy = mid;
        ListNode reverse = null;
        while(copy!=null){
            ListNode listNode = copy;
            copy =copy.next;
            listNode.next = reverse;
            reverse = listNode;
        }
        return reverse;
    }
}
