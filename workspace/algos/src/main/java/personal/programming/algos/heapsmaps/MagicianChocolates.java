package personal.programming.algos.heapsmaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class MagicianChocolates {
    public static void main(String []args){
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList( 2147483647, 2000000014, 2147483647));
        System.out.println(nchoc(10, a));
    }
    public static int nchoc(int A, ArrayList<Integer> B) {
        long count = 0;
        Collections.sort(B, Collections.reverseOrder());
        PriorityQueue<Long> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<B.size();i++)
        {
            priorityQueue.add((long)B.get(i));
        }
        while(A>0){
            long temp = priorityQueue.remove();
            count+=temp;
            priorityQueue.add(temp/2);
            A--;
        }
        return (int)(count%1000000007);
    }
}
