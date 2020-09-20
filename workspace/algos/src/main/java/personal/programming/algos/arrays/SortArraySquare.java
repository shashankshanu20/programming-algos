package personal.programming.algos.arrays;

import java.util.ArrayList;

public class SortArraySquare {
    public static void main(String []args){
        ArrayList<Integer> A = new ArrayList<>();
        System.out.println(solve(A));
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<A.size();i++){
            result.add(0);
        }
        int currentIndex = A.size()-1;
        int leftIndex = 0;
        int rightIndex = A.size()-1;
        while(leftIndex<=rightIndex){
            int left = A.get(leftIndex)*A.get(leftIndex);
            int right = A.get(rightIndex)*A.get(rightIndex);
            if(left>right){
                result.set(currentIndex--, left);
                leftIndex++;
            }
            else{
                result.set(currentIndex--, right);
                rightIndex--;
            }
        }
        return result;
    }
}
