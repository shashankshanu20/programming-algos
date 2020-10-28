package personal.programming.algos.dynamicprogramming;

import java.util.*;

public class LongestArithmeticProgression {

    public static void main(String []arg){

    }

    public int solve(final List<Integer> A) {
        int maxLength=0;
        ArrayList<Map<Integer,Integer>>memory =  new ArrayList<>();
        for(int i = 0;i<A.size();i++){
            memory.add(new HashMap<>());
        }
        for(int i=1;i<A.size();i++)
        {
            for(int j=0;j<i;j++)
            {
                int diff = A.get(i) - A.get(j);
                memory.get(i).put(diff,memory.get(j).containsKey(diff)?memory.get(j).get(diff) + 1:1);
                maxLength = Math.max(maxLength,memory.get(i).get(diff));
            }
        }
        return maxLength+1;
    }

}
