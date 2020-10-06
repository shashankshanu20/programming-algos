package personal.programming.algos.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SubarrayWithOdd {

    public int solve(ArrayList<Integer> A, int B) {

        Map<Integer, Integer> map = new HashMap<>();
        int n = A.size();
        int indx=0;
        int ans=0;
        for(int i=0;i<n;i++){
            if(A.get(i)%2==1)
                A.set(i,1);
            else
                A.set(i,0);

        }
        map.put(0,1);
        int sum=0;
        for(int i=0;i<n;i++){
            sum +=A.get(i);
            if(map.containsKey(sum-B)){
                ans += map.get(sum-B);
            }

            map.put(sum,map.getOrDefault(sum,0)+1);
        }

        return ans;
    }
}
