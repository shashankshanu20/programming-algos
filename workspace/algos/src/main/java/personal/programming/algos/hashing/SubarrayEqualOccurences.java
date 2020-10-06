package personal.programming.algos.hashing;

import java.util.ArrayList;

public class SubarrayEqualOccurences {

    public static void main(String []args){

    }

    public int solve(ArrayList<Integer> A, int B, int C) {
        int count = 0;

        for (int i= 0 ; i<A.size(); i++){
            int bcount = 0, ccount = 0;
            for (int j = i; j<A.size(); j++ ) {
                bcount = A.get(j)==B?bcount+1:bcount;
                ccount = A.get(j)==C?ccount+1:ccount;
                if(bcount==ccount){
                    count++;
                }
            }
        }

        return count;
    }
}
