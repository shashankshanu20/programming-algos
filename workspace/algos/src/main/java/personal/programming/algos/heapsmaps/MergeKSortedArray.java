package personal.programming.algos.heapsmaps;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeKSortedArray {
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList result=new ArrayList();
        PriorityQueue<Integer> priorityQueue=new PriorityQueue();
        for(ArrayList al:A)
            priorityQueue.addAll(al);
        while(priorityQueue.size()!=0)
            result.add(priorityQueue.poll());
        return result;
    }
}
