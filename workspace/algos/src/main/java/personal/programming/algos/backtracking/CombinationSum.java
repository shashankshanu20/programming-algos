package personal.programming.algos.backtracking;

import java.util.ArrayList;
import java.util.Collections;

public class CombinationSum {

    public static void main(String []args){

    }


    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
        ArrayList<ArrayList<Integer>> result =new ArrayList<>();
        if (A==null || A.size()==0)
            return result;
        Collections.sort(A);
        checkSum(result,0,A,new ArrayList<Integer>(),B);
        return result;
    }

    public void checkSum(ArrayList<ArrayList<Integer>> result,int index,ArrayList<Integer> A,ArrayList<Integer> temp,int sum){
        if (sum<=0){
            if (sum==0){
                result.add(temp);
            }
            return;
        }

        for (int i=index;i<A.size();i++){
            if (i==index || A.get(i)!=A.get(i-1)){
                temp.add(A.get(i));
                checkSum(result,i,A,temp,sum-A.get(i));
                temp.remove(temp.size()-1);
            }
        }
    }
}
