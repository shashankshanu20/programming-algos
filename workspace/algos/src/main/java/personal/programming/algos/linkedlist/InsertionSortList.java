package personal.programming.algos.linkedlist;

public class InsertionSortList {

    private class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
    }


    public ListNode insertionSortList(ListNode A) {
//        ListNode copya = A;
//        ListNode previousNode = copya;
//        copya = copya.next;
//        ListNode keyNode;
//        ListNode tempNode;
//        while (copya!=null){
//            keyNode = copya;
//            tempNode = A;
//            ListNode tempPrevNode = tempNode;
//            while (tempNode!=keyNode){
//                if(tempNode.val>keyNode.val){
//                    previousNode.next = keyNode.next;
//                    tempPrevNode.next = keyNode;
//                    tempPrevNode.next.next = tempNode;
//                    break;
//                }
//                tempPrevNode = tempNode;
//                tempNode = tempNode.next;
//            }
//            previousNode = copya;
//            copya = copya.next;
//        }
//        return A;

        if(null == A)
            return null;
        ListNode first = new ListNode(Integer.MIN_VALUE);
        ListNode prev = first, temp = A;
        while(null != temp) {
            prev.next = temp.next;
            ListNode tmp = first;
            while( null != tmp.next && tmp.next.val < temp.val && tmp != prev)
                tmp = tmp.next;
            temp.next = tmp.next;
            tmp.next = temp;
            temp = (tmp == prev) ? temp.next : prev.next;
        }
        return first.next;
    }
}
