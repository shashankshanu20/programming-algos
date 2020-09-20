package personal.programming.algos.bitmanipulation;

import java.util.ArrayList;
import java.util.Collections;

public class FindMinXor {
    public int findMinXor(ArrayList<Integer> A) {
        Collections.sort(A);
        int minVal=Integer.MAX_VALUE;
        for(int i=0;i<A.size()-1;i++){
            minVal=Math.min(minVal,A.get(i)^A.get(i+1));
        }
        return minVal;
    }
}
