package personal.programming.algos.dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;

public class KnapsackZeroOne {

    public static void main(String []args){
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(359, 963, 465, 706, 146, 282, 828, 962, 492));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(96, 43, 28, 37, 92, 5, 3, 54, 93 ));
        int C = 383;
        KnapsackZeroOne knapsackZeroOne = new KnapsackZeroOne();
        System.out.println(knapsackZeroOne.solve(A,B,C));

    }

    public int solve(ArrayList<Integer> A, ArrayList<Integer> B, int C) {
        int [][]memory = new int[A.size()+1][C+1];
        for(int i=0; i<A.size()+1;i++){
            Arrays.fill(memory[i],-1);
        }
        int result = traverse(A, B, A.size(),memory,C);
        return result;
    }

    public int traverse(ArrayList<Integer> A, ArrayList<Integer> B, int index,int [][]memory, int C){
        if(index==0||C==0){
            return 0;
        }
        if(memory[index][C]!=-1){
            return memory[index][C];
        }
        if(B.get(index-1)<=C){
            memory[index][C] = Math.max(A.get(index-1)+traverse(A, B, index-1,memory, C-B.get(index-1)),traverse(A, B, index-1,memory, C));
            return memory[index][C];
        }else{
            memory[index][C] = traverse(A, B, index-1,memory, C);
            return memory[index][C];
        }
    }
}
