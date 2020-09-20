package personal.programming.algos.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumGap {
    public static void main(String []args){

        List<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(10);
        A.add(5);
        System.out.println(maximumGap(A));
    }

    public static int maximumGap(final List<Integer> A) {
        if(A.size()<2){
            return 0;
        }
        int maxElement = 0;
        Collections.sort(A);
        for(int i=0;i<A.size()-1;i++){
            if(Math.abs(A.get(i+1)-A.get(i))>maxElement){
                maxElement = Math.abs(A.get(i+1)-A.get(i));
            }
        }
        return maxElement;
    }
}
