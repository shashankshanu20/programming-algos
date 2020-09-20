package personal.programming.algos.arrays;

import java.util.ArrayList;

public class PickFromBothSides {
    public static void main(String []args){

        ArrayList<Integer> A = new ArrayList<>();

        System.out.println(solve(A, 3));
    }

    public static int solve(ArrayList<Integer> A, int B){
        if(B>A.size()){
            return 0;
        }
        int maxSum = 0, sum = 0;
        for(int i =0 ; i< B; i++){
            sum += A.get(i);
        }
        maxSum = sum;

        for(int i = B-1, j = A.size()-1; i >-1; i--, j--){
            sum -= A.get(i);
            sum += A.get(j);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
