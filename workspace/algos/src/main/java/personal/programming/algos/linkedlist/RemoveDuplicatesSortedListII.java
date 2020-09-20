package personal.programming.algos.linkedlist;

public class RemoveDuplicatesSortedListII {

    private class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
    }

    public static void main(String []args){

    }

    public ListNode deleteDuplicates(ListNode A) {
//        ListNode currentNode = A;
//        ListNode previousNode = null;
//        while(currentNode!=null){
//            if(currentNode.next!=null){
//                if(currentNode.val==currentNode.next.val){
//                    while (currentNode.next!=null&&currentNode.val==currentNode.next.val){
//                        currentNode = currentNode.next;
//                    }
//                    if(previousNode!=null){
//                        previousNode.next = currentNode.next;
//                    }else{
//                        previousNode = currentNode.next;
//                        A = previousNode;
//                    }
//                    // currentNode = currentNode.next;
//                }else{
//                    previousNode = currentNode;
//                    currentNode = currentNode.next;
//                }
//            }else{
//                previousNode = currentNode;
//                currentNode = currentNode.next;
//            }
//        }
//        return A;

        ListNode previousNode = null;
        ListNode currentNOde = A;
        ListNode result = A;
        while(currentNOde != null && currentNOde.next != null) {
            if(currentNOde.val == currentNOde.next.val) {
                while(currentNOde.next != null && currentNOde.val == currentNOde.next.val) {
                    currentNOde = currentNOde.next;
                }
                currentNOde = currentNOde.next;
                if(previousNode == null) {
                    result = currentNOde;
                } else {
                    previousNode.next = currentNOde;
                }
            } else {
                previousNode = currentNOde;
                currentNOde = currentNOde.next;
            }
        }
        return result;
    }
}
