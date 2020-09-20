package personal.programming.algos.twopointers;

import java.util.ArrayList;

public class DiffPossible {
    public static void main(String []args){

    }

    public int diffPossible(ArrayList<Integer> A, int B) {
        int i=0, j=1;
        while(j < A.size()){

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
