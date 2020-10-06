package personal.programming.algos.heapsmaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class ProfitMaximization {

    public int solve(ArrayList<Integer> A, int B) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < A.size(); i++)
            priorityQueue.add(A.get(i));

        int maxProfit = 0;

        while (B>0)
        {
            int top = priorityQueue.remove();
            if (top == 0)
                break;

            maxProfit += top;
            priorityQueue.add(top - 1);
            B--;
        }

        return maxProfit;
    }
}
