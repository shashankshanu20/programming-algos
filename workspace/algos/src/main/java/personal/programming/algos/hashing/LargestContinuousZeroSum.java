package personal.programming.algos.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LargestContinuousZeroSum {
    public ArrayList<Integer> lszero(ArrayList<Integer> A) {
        Map<Integer, ArrayList<Integer>> arrayListMap = new HashMap<>();
        int maxSize = Integer.MIN_VALUE;
        for(int i = 0;i<A.size();i++){
            ArrayList<Integer> temp = new ArrayList<>();
            int sum = 0;
            for(int j = i ; j<A.size();j++){
                temp.add(A.get(j));
                sum+=A.get(j);
                if(sum==0){
                    maxSize = Math.max(maxSize,temp.size());
                    if(!arrayListMap.containsKey(temp.size())){
                        arrayListMap.put(temp.size(), new ArrayList<>(temp));
                    }
                }
            }
        }

        return arrayListMap.isEmpty()?new ArrayList<>():arrayListMap.get(maxSize);

    }
}
