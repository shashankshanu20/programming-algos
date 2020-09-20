package personal.programming.algos.arrays;

import java.util.ArrayList;
import java.util.List;

public class MaximumDistance {
    public static void main(String []args){

        List<Integer> A = new ArrayList<>();


        System.out.println(maximumGap(A));
    }

    public static int maximumGap(final List<Integer> A) {
        if (A.size()==1)
            return 0;

        int maxRight[] = new int[A.size()];
        int minLeft[] = new int[A.size()];
        minLeft[0] = A.get(0);
        for (int i = 1; i < A.size(); ++i)
            minLeft[i] = Math.min(A.get(i), minLeft[i - 1]);
        maxRight[A.size() - 1] = A.get(A.size() - 1);
        for (int i = A.size() - 2; i >= 0; --i)
            maxRight[i] = Math.max(A.get(i), maxRight[i + 1]);

        int i=0,j=0;
        int maxDiff=-1;
        while (i<A.size() && j<A.size()){
            if (minLeft[i]<=maxRight[j]){
                maxDiff=Math.max(maxDiff,j-i);
                j++;
            }
            else
                i++;
        }
        return maxDiff;
    }

}
