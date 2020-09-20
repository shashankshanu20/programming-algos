package personal.programming.algos.arrays;

import java.util.ArrayList;

public class MaxMinElement {
    public static void main(String []args){
        ArrayList<Integer> A = new ArrayList<>();
        System.out.println(solve(A));
    }

    public static int solve(ArrayList<Integer> A) {
        int minElement = A.get(0);
        int maxElement = A.get(0);

        for(Integer i:A){
            minElement = Math.min(i,minElement);
            maxElement = Math.max(i,maxElement);
        }
        return maxElement + minElement;
    }
}
