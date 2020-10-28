package personal.programming.algos.dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MergeElements {

    public static void main(String []args){
        List<Consumer<Integer>> functions = new ArrayList<Consumer<Integer>>();
        int []nums = new int[]{0,1,2};
        for(int i:nums){
            functions.add((j)->System.out.print(j-nums[i]));
        }
        for(int i:nums){
            functions.get(i).accept(i+1);
            System.out.print(" ");
        }
    }

    public int solve(ArrayList<Integer> A) {
        int [][]memory = new int[A.size()+1][A.size()+1];
        for(int i = 0; i<A.size()+1;i++){
            Arrays.fill(memory[i], -1);
        }
        return merge(0,A.size()-1,A, memory);
    }
    public int merge(int i, int j, ArrayList<Integer> a, int [][]memory){
        if (memory[i][j] != -1) {
            return memory[i][j];
        }
        if (i == j) {
          memory[i][j] = 0;
        } else if (i == j - 1) {
          memory[i][j] = a.get(i) + a.get(j);
        }
        else{
            int val=Integer.MAX_VALUE;
            int sum = a.get(j);
            for(int k=i;k<j;k++){
                sum += a.get(k);
                val = Math.min(val, merge(i,k,a,memory)+merge(k+1,j,a,memory));
            }
            memory[i][j] = val + sum;
        }
        return memory[i][j];
    }
}
