package personal.programming.algos.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateInArray {
    public static void main(String []args){
        List<Integer> A = new ArrayList<>();
        A.add(3);
        A.add(4);
        A.add(1);
        A.add(4);
        A.add(1);
        System.out.println(repeatedNumber(A));
    }

    public static int repeatedNumber(final List<Integer> A) {
        Map<Integer,Boolean> numberMap = new HashMap<>();
        for(Integer i:A){
            if(i<A.size()+1){
                if(numberMap.containsKey(i)){
                    return i;
                }else{
                    numberMap.put(i,Boolean.TRUE);
                }
            }
        }
        return -1;
    }
}
