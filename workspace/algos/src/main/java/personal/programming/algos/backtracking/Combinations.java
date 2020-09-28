package personal.programming.algos.backtracking;

import java.util.ArrayList;
import java.util.Stack;
import java.util.stream.Collectors;

public class Combinations {

    public ArrayList<ArrayList<Integer>> combine(int A, int B) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(B>A){
            return result;
        }
        return util(1, A, B, result, new Stack<Integer>());
    }

    public ArrayList<ArrayList<Integer>> util(int start, int A, int B, ArrayList<ArrayList<Integer>> result, Stack<Integer> subList){
        if(B==0){
            result.add(new ArrayList<>(subList));
            return result;
        }
        for(int i=start;i<=A;i++){
            subList.push(i);
            util(i+1,A,B-1,result,subList);
            subList.pop();
        }
        return result;
    }
}
