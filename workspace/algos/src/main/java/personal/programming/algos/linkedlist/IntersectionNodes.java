package personal.programming.algos.linkedlist;

public class IntersectionNodes {

   private class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
  }

    public static void main(String  ...args){

    }

    public ListNode getIntersectionNode(ListNode a, ListNode b) {
        ListNode acopy = a;
        ListNode bcopy = b;

        int lengthA = calculateLength(acopy);
        int lengthB = calculateLength(bcopy);
        int diff = Math.abs(lengthA-lengthB);
        int mergeIterator = 0;
        if(diff>0){
            int loopCount = diff;
            if(lengthA>lengthB){
                mergeIterator = lengthB;
                while(loopCount>0){
                    acopy= acopy.next;
                    loopCount--;
                }
            }else{
                mergeIterator = lengthA;
                while (loopCount>0){
                    bcopy= bcopy.next;
                    loopCount--;
                }
            }
        }else{
            mergeIterator = lengthA;
        }


        while(mergeIterator>0){
            if(acopy==bcopy){
                return acopy;
            }
            acopy = acopy.next;
            bcopy = bcopy.next;
        }

        return null;
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
