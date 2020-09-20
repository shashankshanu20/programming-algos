package personal.programming.algos.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LeadersInArray {
    public static void main(String []args){

        ArrayList<Integer> A = new ArrayList<>();
//        A.add(16);
//        A.add(17);
//        A.add(4);
//        A.add(3);
//        A.add(5);
//        A.add(2);
        A.add(1);
        A.add(2);
        System.out.println(solve(A));
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<>();
        Set<Integer> resultSet = new HashSet<Integer>();
        int max = 0;
        if(!A.isEmpty()){
            resultSet.add(A.get(A.size()-1));
            max = A.get(A.size()-1);
            if(A.size()==1){
                result.add(A.get(A.size()-1));
                return result;
            }
        }

        for(int i = A.size()-2;i>=0;i--){
            max = Math.max(A.get(i), max);
            resultSet.add(max);
        }


        resultSet.stream().forEach(i->result.add(i));

        return result;
    }
}
