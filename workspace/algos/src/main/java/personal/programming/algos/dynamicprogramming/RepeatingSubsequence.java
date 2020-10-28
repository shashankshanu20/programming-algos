package personal.programming.algos.dynamicprogramming;

import java.util.Arrays;

public class RepeatingSubsequence {
    public int anytwo(String A) {
        int [][]memory = new int[A.length()+1][A.length()+1];
        for(int i = 0;i<A.length()+1;i++){
           Arrays.fill(memory[i],-1);
        }
        return solve(A,A.length(),A.length(),memory)>=2?1:0;
    }

    int solve(String a,int i,int j,int [][]memory){
        if(i==0 || j==0){
            return memory[i][j]=0;
        }
        if(memory[i][j]!=-1){
            return memory[i][j];
        }
        if(a.charAt(i-1)==a.charAt(j-1) && i!=j){
            return memory[i][j] = 1+solve(a,i-1,j-1, memory);
        }
        else{
            memory[i][j]= Math.max(solve(a,i-1,j,memory),solve(a,i,j-1,memory));
        }
        return memory[i][j];
    }
}
