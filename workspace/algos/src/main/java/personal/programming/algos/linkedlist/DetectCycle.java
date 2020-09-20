package personal.programming.algos.linkedlist;

public class DetectCycle {

    public static void main(String []args){

    }

    private class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
    }


    public ListNode detectCycle(ListNode a) {
//        ListNode currentNode = a;
//        ListNode previousNode = null;
//        while (currentNode!=null){
//
//            ListNode iterateNode = currentNode.next;
//            while (iterateNode!=null){
//                if (iterateNode == currentNode){
//                    return previousNode;
//                }
//                iterateNode = iterateNode.next;
//            }
//            previousNode = currentNode;
//            currentNode = currentNode.next;
//        }
//
//        return null;
        if(a==null||a.next==null)
            return null;
        ListNode slow=a;
        ListNode fast=a;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                ListNode temp=a;
                ListNode temp1=slow;
                while(temp!=temp1)
                {
                    temp=temp.next;
                    temp1=temp1.next;
                }
                return temp;
            }
        }
        return null;
    }
}
