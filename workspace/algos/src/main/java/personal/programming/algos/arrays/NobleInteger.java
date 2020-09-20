package personal.programming.algos.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class NobleInteger {
    public static void main(String []args){
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(1);
        A.add(3);
        A.add(3);
        System.out.println(solve(A));
    }

    public static int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        for(int i=A.size()-1;i>=0;i--){
            if(A.get(i)==(A.size()-1-i)){
                return 1;
            }
        }
        return -1;
    }
}
