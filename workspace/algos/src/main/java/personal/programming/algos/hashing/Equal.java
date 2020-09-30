package personal.programming.algos.hashing;

import java.util.*;

public class Equal {

    public static void main(String []args){
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(4);
        a.add(7);
        a.add(1);
        a.add(2);
        a.add(9);
        a.add(8);
        System.out.println(equal(a));
    }

    public static ArrayList<Integer> equal(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(A.size());
        result.add(A.size());
        result.add(A.size());
        result.add(A.size());
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < A.size() - 1; i++) {
          for (int j = i + 1; j < A.size(); j++) {
            int sum = A.get(i) + A.get(j);
            if (map.containsKey(sum)) {
                ArrayList<Integer> tempArr = new ArrayList<>();
                tempArr.add(map.get(sum).get(0));
                tempArr.add(map.get(sum).get(1));
                tempArr.add(i);
                tempArr.add(j);
              if (map.get(sum).get(0) < i && map.get(sum).get(1) != i && map.get(sum).get(1) != j
                      &&
                      (result.get(0) > tempArr.get(0) ||
                              (result.get(0) == tempArr.get(0) && result.get(1) > tempArr.get(1)) ||
                              (result.get(0) == tempArr.get(0) && result.get(1) == tempArr.get(1) && result.get(2) > tempArr.get(2)) ||
                              (result.get(0) == tempArr.get(0) && result.get(1) == tempArr.get(1) && result.get(2) == tempArr.get(2) && result.get(3) > tempArr.get(3))) ) {

                result = tempArr;
              }
            } else {
              ArrayList<Integer> temp = new ArrayList<>();
              temp.add(i);
              temp.add(j);
              map.put(sum, temp);
            }
          }
        }

        return result;
    }
}
