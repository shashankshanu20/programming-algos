package personal.programming.algos.hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class NumberofXor {
    public int solve(ArrayList<Integer> A, int B) {
        Map<Integer, Boolean>  map = new HashMap<>();
        Collections.sort(A);
        int count = 0;
        for(int i = 0; i< A.size()-1;i++){
            if(map.get(A.get(i)^B)){
                count++;
            }else {
                map.put(A.get(i), Boolean.TRUE);
            }
        }
        return count;
    }
}
