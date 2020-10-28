package personal.programming.algos.dynamicprogramming;

import java.util.ArrayList;

public class MinimumDifferenceSubset {
    int subsetSum(ArrayList<Integer> a, int B)
    {
//        int i,j;
        int n = a.size();
        int [][]memory = new int[n+1][B+1];
        for(int i=0;i<=n;i++){
            memory[i][0]=1;
        }
        for(int i=1;i<=B;i++){
            memory[0][i]=0;
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=B;j++)
            {
                if(memory[i-1][0]<=j)
                    memory[i][j] = memory[i-1][j-memory[i-1][0]]==1 || memory[i-1][j]==1?1:0;
                else
                    memory[i][j] = memory[i-1][j];
            }
        }
        return memory[n][B];
    }
    int solve(ArrayList<Integer> A)
    {
        int n = A.size();
        int sum = 0;
        for(int i=0;i<n;i++)
            sum += A.get(i);

        for(int i=sum/2;i>=0;i--){
            {
                if(subsetSum(A,i)==1)
                    return sum-2*i;
            }
        }
        return 1;
    }
}
