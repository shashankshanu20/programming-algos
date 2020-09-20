package personal.programming.algos.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class WaveArray {
    public static void main(String []args){
        ArrayList<Integer> A = new ArrayList<>();
        System.out.println(wave(A));
    }

    public static ArrayList<Integer> wave(ArrayList<Integer> A) {

        Collections.sort(A);
        for(int i=0;i<A.size()-1;i+=2){
            int temp = A.get(i);
            A.set(i,A.get(i+1));
            A.set(i,temp);
        }
        return A;
    }
}
