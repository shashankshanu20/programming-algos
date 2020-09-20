package personal.programming.algos.linkedlist;

public class PartitionList {
    public static void main(String []args){

    }

    private class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
    }

    public ListNode partition(ListNode A, int B) {
        ListNode currentNode = A;
        ListNode previousNode = null;
        ListNode temp = null;
        while(currentNode != null && currentNode.val < B) {
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        if(currentNode == null) {
            return A;
        }

        while(currentNode != null) {
            if(currentNode.next != null && currentNode.next.val < B) {
                temp = currentNode.next;
                currentNode.next = currentNode.next.next;

                if(previousNode == null) {
                    temp.next = A;
                    previousNode = temp;
                    A = previousNode;
                } else {
                    ListNode tempII = previousNode.next;
                    previousNode.next = temp;
                    temp.next = tempII;
                    previousNode = previousNode.next;
                }
            } else {
                currentNode = currentNode.next;
            }
        }
        return A;
    }
}
