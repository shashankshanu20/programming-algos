package personal.programming.algos.dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxsumWithoutAdjacentElements {
    public int adjacent(ArrayList<ArrayList<Integer>> A) {
        int []memory = new int[(2*A.get(0).size())+1];
        Arrays.fill(memory, -1);
        return traverse(A, A.get(0).size(),memory);
    }

    public int traverse(ArrayList<ArrayList<Integer>> a,int index, int []memory){
        if(index <= 0){
            return 0;
        }
        if(memory[index] != -1){
            return memory[index];
        }
        return memory[index] = Math.max(Math.max(a.get(0).get(index-1),a.get(1).get(index-1)) + traverse(a,index-2, memory), traverse(a,index-1, memory));
    }
}
