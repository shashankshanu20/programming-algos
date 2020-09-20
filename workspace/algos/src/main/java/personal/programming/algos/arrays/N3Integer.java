package personal.programming.algos.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class N3Integer {
    public static void main(String []args){
        List<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(1);
        A.add(1);
        System.out.println(repeatedNumber(A));
    }

    public static int repeatedNumber(final List<Integer> a) {
        Map<Integer, Integer>  countMap = new HashMap<>();
        float filter = a.size()/3;
        for(Integer integer:a){
            countMap.put(integer, countMap.getOrDefault(integer,0)+1);
            if(countMap.get(integer)>filter){
                return integer;
            }
        }
        return -1;
    }
}
