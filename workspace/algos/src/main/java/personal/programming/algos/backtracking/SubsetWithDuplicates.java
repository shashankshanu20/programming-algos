package personal.programming.algos.backtracking;

import java.util.ArrayList;
import java.util.Collections;

public class SubsetWithDuplicates {

    public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(A==null){
            return null;
        }
        result.add(new ArrayList<>());
        Collections.sort(A);
        for(int i = 0; i<A.size(); i++){
            subsets(A, result, new ArrayList(),i);
        }
        return result;
    }

    public  void subsets(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> temp, int i){
        result.add(temp);
        for (int j=i; j<A.size(); j++) {
            ArrayList tmp = new ArrayList(temp);
            Integer currentItem = A.get(j);
            tmp.add(currentItem);
            subsets(A, result, new ArrayList(tmp), j+1);
            while ( ( (j + 1) < A.size()) && A.get(j+1).equals(currentItem)) {
                j++;
            }
            tmp.remove(tmp.size() - 1);
        }
    }

}
