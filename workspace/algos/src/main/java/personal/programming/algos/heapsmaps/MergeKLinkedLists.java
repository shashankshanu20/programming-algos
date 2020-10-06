package personal.programming.algos.heapsmaps;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeKLinkedLists {

    class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
    }

    public ListNode mergeKLists(ArrayList<ListNode> a) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for(int i=0;i<a.size();i++)
        {
            for(ListNode temp=a.get(i);temp!=null;)
            {
                priorityQueue.add(temp.val);
                temp=temp.next;
            }
        }
        ListNode resultHead=new ListNode(0);
        ListNode temp=resultHead;
        for(int i=0;i<a.size();i++)
        {
            temp.next=a.get(i);
            for(;temp.next!=null;)
            {
                temp.next.val=priorityQueue.remove();
                temp=temp.next;
            }
        }
        return resultHead.next;
    }
}
