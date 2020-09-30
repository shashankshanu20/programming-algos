package personal.programming.algos.hashing;

import java.util.*;

public class TwoSum {

    public ArrayList<Integer> twoSum(final List<Integer> A, int B) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0;i<A.size();i++){
            if(map.containsKey(B-A.get(i))){
                result.add(map.get(B-A.get(i))+1);
                result.add(i+1);
                break;
            }
            else if(!(map.containsKey(A.get(i)))){
                map.put(A.get(i),i);
            }
        }
        return result;
    }
}
