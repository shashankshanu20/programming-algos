package personal.programming.algos.twopointers;

import java.util.ArrayList;
import java.util.Collections;

public class PairWithDifference {
    public static void main(String []args){

    }

    public int solve(ArrayList<Integer> A, int B) {
        Collections.sort(A) ;
        int i=0, j=1;
        while(j < A.size() &&  i <A.size() ) {
            if(i!=j && A.get(j)-A.get(i) == B)
                return 1;
            else if(A.get(j)-A.get(i) > B)
                i++;
            else
                j++;
        }
        return 0;
    }
}
