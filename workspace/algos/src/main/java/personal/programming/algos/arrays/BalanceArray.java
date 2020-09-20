package personal.programming.algos.arrays;

import java.util.ArrayList;
import java.util.List;

public class BalanceArray {

    public static void main(String []args){

        ArrayList<Integer> A = new ArrayList<>();
        System.out.println(solve(A));
    }

    public static int solve(ArrayList<Integer> A) {

        int output = 0;
        List<Integer> oddIndicesSum = new ArrayList<>();
        List<Integer> evenIndicesSum = new ArrayList<>();

        for (int i = 0; i < A.size(); i++) {
            if (i % 2 == 0) {
                evenIndicesSum.add(A.get(i) + (i > 0 ? evenIndicesSum.get(i-1) : 0));
                oddIndicesSum.add((i > 0) ? oddIndicesSum.get(i-1) : 0);
            } else {
                oddIndicesSum.add( A.get(i) + (i > 0 ? oddIndicesSum.get(i-1) : 0));
                evenIndicesSum.add((i > 0) ? evenIndicesSum.get(i-1) : 0);
            }
        }

        for (int i = 0; i < A.size(); i++) {
            int oddCumulativeSum = 0;
            int evenCumulativeSum = 0;

            oddCumulativeSum += (i > 0) ? oddIndicesSum.get(i-1) : 0;
            oddCumulativeSum += (i < A.size() - 1) ? (evenIndicesSum.get(A.size()-1) - evenIndicesSum.get(i)) : 0;

            evenCumulativeSum += (i > 0)? evenIndicesSum.get(i-1) : 0;
            evenCumulativeSum += (i < A.size() - 1) ? (oddIndicesSum.get(A.size() - 1) - oddIndicesSum.get(i)) : 0;
            if (oddCumulativeSum == evenCumulativeSum) {
                output ++;
            }
        }
        return output;
    }


}
