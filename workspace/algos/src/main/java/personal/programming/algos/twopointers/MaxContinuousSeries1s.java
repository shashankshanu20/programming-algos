package personal.programming.algos.twopointers;

import java.util.ArrayList;

public class MaxContinuousSeries1s {
    public static void main(String []args){

    }

    public ArrayList<Integer> maxone(ArrayList<Integer> A, int B) {
        int lW = 0, rW = 0, leftIndex = -1, zeroCount = 0, bestWindow = 0;

        while (rW < A.size()) {
            if (zeroCount <= B) {
                if (A.get(rW) == 0) zeroCount++;
                rW++;
            }

            if (zeroCount > B) {
                if (A.get(lW) == 0) zeroCount--;
                lW++;
            }

            if ( (rW - lW) > bestWindow ) {
                bestWindow = rW - lW;
                leftIndex = lW;
            }
        }

        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<bestWindow;i++){
            res.add(0);
        }
        int index = 0;

        while (index < res.size()) res.set(index++, leftIndex++);

        return res;
    }
}
