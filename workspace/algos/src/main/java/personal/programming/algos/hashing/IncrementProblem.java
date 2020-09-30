package personal.programming.algos.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class IncrementProblem {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {

        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<A.size();i++){
            int firstIndex = result.indexOf(A.get(i));
            if(firstIndex!=-1){
                result.set(firstIndex,A.get(i)+1);
                result.add(A.get(i));
            }
            else{
                result.add(A.get(i));
            }
        }
        return result;
    }
}
