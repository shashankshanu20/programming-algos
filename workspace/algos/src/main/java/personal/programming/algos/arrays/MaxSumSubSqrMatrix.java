package personal.programming.algos.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxSumSubSqrMatrix {
    public static void main(String []args){
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        A.add(arrayList);
        arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(2);
        A.add(arrayList);
        arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(8);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(3);
        A.add(arrayList);
        arrayList = new ArrayList<>();
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(4);
        A.add(arrayList);
        arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(5);
        A.add(arrayList);


        System.out.println(solve(A,3));
    }

    public static int solve(ArrayList<ArrayList<Integer>> A, int B) {
        int maxSum = Integer.MIN_VALUE;
        int row = 0, column =0;

        while (row+B-1<A.size()){
            column = 0;

            while (column+B-1<A.size()){
                int sum = 0;
                int rowIterationCount = 0;
                for(int i = row; rowIterationCount < B; i++){
                    int columnIterationCount = 0;
                    for(int j = column;columnIterationCount < B ; j++)    {
                        sum = sum + A.get(i).get(j);
                        columnIterationCount++;
                    }
                    rowIterationCount++;
                }
                column++;
                maxSum = Math.max(sum, maxSum);
            }
            row++;
        }

        return maxSum;
    }
}
