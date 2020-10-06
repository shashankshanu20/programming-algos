package personal.programming.algos.heapsmaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class NMaxPairCombination {

    public static void main(String []args){
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(3, 2, 4, 2));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(4, 3, 1, 2));
        System.out.println(solve(A, B));
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> result = new ArrayList<>();
        Collections.sort(A, Collections.reverseOrder());
        Collections.sort(B, Collections.reverseOrder());

        int n = A.size();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(minHeap.size() != 0 && minHeap.size() == n && minHeap.peek()>A.get(i)+B.get(j)) {
                    break;
                }
                minHeap.add(A.get(i)+B.get(j));
                if(minHeap.size()>n) {
                    minHeap.remove();
                }
            }
        }

        while(minHeap.size()>0) {
            int ele = minHeap.remove();
            result.add(ele);
        }
        Collections.sort(result, Collections.reverseOrder());
        return result;
    }
}
