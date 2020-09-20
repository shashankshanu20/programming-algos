package personal.programming.algos.binarysearch;

import java.util.ArrayList;
import java.util.List;

public class PaintersPartitionProblem {

    public static void main(String []args){

    }

    int paint(int A, int B, ArrayList<Integer> C) {
        long left = 0;
        long right = 0;
        for (int c : C) {
            left = Math.max(left, c);
            right += c;
        }

        long ans = 0;
        while(left <= right) {
            long mid = (left + right) / 2L;
            int cntPainters = numberOfPaiters(C, mid);
            if (cntPainters <= A) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return (int)((ans * (long)B) % 10000003);
    }

    int numberOfPaiters(List<Integer> C, long timeLimit) {
        int count = 1;
        long currentSum = 0;
        for (int c : C) {
            if (currentSum + c <= timeLimit) {
                currentSum += c;
            } else {
                count++;
                currentSum = c;
            }
        }
        return count;
    }
}
