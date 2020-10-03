package personal.programming.algos.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LongestSubArray {


    public int solve(ArrayList<Integer> A) {

        for(int i=0; i<A.size(); i++){
            if(A.get(i)==0)
                A.set(i,-1);
        }

        Map<Integer, Integer> map = new HashMap<>();
        int sum=0;
        int result=0;
        for(int i=0; i<A.size(); i++){
            sum+=A.get(i);
            if(sum==1)
                result=i+1;
            if(!map.containsKey(sum))
                map.put(sum,i);
            if(map.containsKey(sum-1)){
                result=Math.max(result, i-map.get(sum-1));
            }
        }
        return result;
    }
}
