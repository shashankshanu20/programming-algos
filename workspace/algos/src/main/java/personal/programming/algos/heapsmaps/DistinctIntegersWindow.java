package personal.programming.algos.heapsmaps;

import java.util.*;

public class DistinctIntegersWindow {

    public static void main(String []args){
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 1, 3, 4, 3));
        System.out.println(dNums(arrayList,3));
    }

    public static ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        ArrayList<Integer> result = new ArrayList<>();
//        for(int i = 0; i<A.size()-B+1; i++){
//            int j = i;
//            Set<Integer> set = new HashSet<>();
//            while(j<i+B){
//                set.add(A.get(j));
//                j++;
//            }
//            result.add(set.size());
//        }

        if (B>A.size())
            return result;

        Map<Integer, Integer> map = new HashMap<>();

        for (int j = 0; j< B; j++){
            map.put(A.get(j),j);
        }
        result.add(map.size());

        for (int i = 1; i< A.size()-B+1; i++){
            if (map.get(A.get(i-1)) == i-1) {
                map.remove(A.get(i-1));
            }
            map.put(A.get(B+i-1), B+i-1);
            result.add(map.size());
        }
        return result;
    }
}
