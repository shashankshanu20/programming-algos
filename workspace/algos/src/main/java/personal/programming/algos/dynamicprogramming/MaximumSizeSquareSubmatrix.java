package personal.programming.algos.dynamicprogramming;

import java.util.ArrayList;

public class MaximumSizeSquareSubmatrix {
    public int solve(ArrayList<ArrayList<Integer>> A) {
        int m = A.size(), n = A.get(0).size(), maxEdgeLen = 0;
        for(int i=0; i<m; i++)
            for(int j=0; j<n; j++){
                if(A.get(i).get(j) == 0)    continue;
                int a = i>0 && j>0 ?A.get(i-1).get(j-1) : 0;
                int b = i>0 ? A.get(i-1).get(j) : 0;
                int c = j>0 ? A.get(i).get(j-1) : 0;
                A.get(i).set(j, Math.max(A.get(i).get(j), Math.min(a,Math.min(b,c))+1));
                maxEdgeLen = Math.max(maxEdgeLen, A.get(i).get(j));
            }
        return maxEdgeLen*maxEdgeLen;
    }
}
