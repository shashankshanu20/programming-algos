package personal.programming.algos.backtracking;

import java.util.ArrayList;
import java.util.Collections;

public class Subset {


    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
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
        temp.add(A.get(i));
        result.add(temp);
        if(i==A.size())
            return;
        for(int j=i+1;j<A.size();j++){
            subsets(A, result, new ArrayList<>(temp), j);
        }
    }

}
