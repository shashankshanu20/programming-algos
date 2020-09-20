package personal.programming.algos.arrays;

import java.util.ArrayList;

public class PascalTriangleKthRow {
    public static void main(String []args){

        System.out.println(getRow(3));
    }
    public static ArrayList<Integer> getRow(int A) {
        ArrayList<Integer> previousRow = new ArrayList<>();
        ArrayList<Integer> currentRow = new ArrayList<>();
        previousRow.add(1);
        if(A==0){
            return previousRow;
        }

        int i=1;
        while(i<=A+1){
            int j = i;
            currentRow = new ArrayList<>();
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
                currentRow.add(k,sum);
                k++;
                j--;
            }

            i++;
            if(i==A+1){
                return currentRow;
            }
            previousRow = currentRow;
        }
        return currentRow;
    }
}
