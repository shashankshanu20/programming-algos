package personal.programming.algos.arrays;

import java.util.ArrayList;

public class MaxUnsortedSubArray {
    public static void main(String []args){
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);
//        A.add(1);
        System.out.println(subUnsort(A));
    }
    public static ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
        int startIndex, endIndex,size;
        startIndex = endIndex = -1;
        size = A.size();
        ArrayList result = new ArrayList();

        int[] minArr = new int[size];
        int[] maxArr = new int[size];

        maxArr[0] = A.get(0);
        minArr[size-1] = A.get(size-1);

        int i = 1;
        int j = size-2;

        while( i < size && j >= 0){
            maxArr[i] = Math.max(maxArr[i-1],A.get(i));
            minArr[j] = Math.min(minArr[j+1],A.get(j));
            i++;
            j--;
        }

        int k = 0;
        for(k = 0; k< size; k++){
            if(A.get(k) != minArr[k]){
                startIndex = k;
                break;
            }
        }

        if(k == size){
            result.add(-1);
            return result;
        }


        for( k = size-1; k >= 0; k--){
            if(A.get(k) != maxArr[k]){
                endIndex = k;
                break;
            }

        }
        result.add(startIndex);
        result.add(endIndex);
        return result;
    }
}
