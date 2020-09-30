package personal.programming.algos.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FirstRepeatingElement {
    public int solve(ArrayList<Integer> A) {
        Map<Integer,Integer> map = new HashMap<>();
        int minIndex = Integer.MAX_VALUE;
        for(int i =0; i<A.size();i++){
            if(map.containsKey(A.get(i))){
                minIndex = Math.min(minIndex,map.get(A.get(i)));
            }else{
                map.put(A.get(i),i);
            }
        }
        return minIndex==Integer.MAX_VALUE?-1:A.get(minIndex);
    }
}
