package personal.programming.algos.dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;

public class IncreasingPathInMatrix {
    public int solve(ArrayList<ArrayList<Integer>> A) {
        int [][]memory = new int[A.size()][A.get(0).size()];
        for(int i=0; i<A.size(); i++){
            Arrays.fill(memory[i],-1);
        }
        return 1;
    }

    public int traverse(ArrayList<ArrayList<Integer>> a, int i, int j, int [][]memory){
        if(i==a.size()-1||j==a.get(0).size()-1){
            memory[i][j]= 1;
            return memory[i][j];
        }
        if(memory[i][j]!=-1){
            return memory[i][j];
        }

        return memory[i][j];
    }

}
