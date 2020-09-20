package personal.programming.algos.arrays;

import java.util.ArrayList;

public class PascalTriangle {

    public static void main(String  []args){

        System.out.println(solve(7
        ));
    }

    public static ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        if(A == 0){
            return result;
        }
        ArrayList<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);
        if(A==1){
            return result;
        }

        int i=1;
        while(i<A){
            int j = i;
            ArrayList<Integer> previousRow = result.get(i-1);
            ArrayList<Integer> newRow = new ArrayList<>();
            int k =0;
            while(j>=0){
                int sum = 0;
                if(k==0){
                    sum = previousRow.get(k);
                }else if(k==previousRow.size()){
                    sum = previousRow.get(k-1);
                }else{
                    sum = previousRow.get(k)+previousRow.get(k-1);
                }
                newRow.add(k,sum);
                k++;
                j--;
            }
            result.add(newRow);
            i++;
        }
        return result;
    }
}
