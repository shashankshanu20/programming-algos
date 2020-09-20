package personal.programming.algos.arrays;

import java.util.ArrayList;

public class MaxNonNegativeSubArray {

    public static void main(String []args){
        ArrayList<Integer> array = new ArrayList<>();
        array.add(336465782);
        array.add(-278722862);
        array.add(-2145174067);
        array.add(1101513929);
        array.add(1315634022);
        array.add(-1369133069);
        array.add(1059961393);
        array.add(628175011);
        array.add(-1131176229);
        array.add(-859484421);
        System.out.println(array);
        ArrayList<Integer> subArray = maxset(array);
        System.out.println(subArray);
    }

    public static ArrayList<Integer> maxset(ArrayList<Integer> A) {
        long max = 0;
        int maxStartingIndex = 0;
        int maxEndingIndex = 0;
        int currentStartingIndex = 0;
        int currentEndingIndex = 0;
        long currentSum = 0;
        Boolean hasSubArray = Boolean.FALSE;
        ArrayList<Integer> subArray = new ArrayList<>();
        for(int i = 0;i<A.size();i++){
            if(A.get(i)<0){
                if(currentSum > max){
                    maxStartingIndex = currentStartingIndex;
                    maxEndingIndex = currentEndingIndex;
                    max = currentSum;
                }else if(currentSum == max){
                    if((maxEndingIndex-maxStartingIndex)<(currentEndingIndex-currentStartingIndex)){
                        maxStartingIndex = currentStartingIndex;
                        maxEndingIndex = currentEndingIndex;
                    }
                }
                currentSum = 0;
            }else{
                hasSubArray = Boolean.TRUE;
                if(i>=1){
                    //checking if previous index contained a negative number
                    if( A.get(i-1) < 0 ){
                        currentStartingIndex = i;
                    }
                }else{
                    currentStartingIndex = i;
                }
                currentSum = currentSum + A.get(i);
                currentEndingIndex = i;
            }
        }

        boolean maxIndices = Boolean.TRUE;
        if(hasSubArray){
            if(currentSum>max){
                maxIndices = Boolean.FALSE;
            }else if(currentSum==max){
                if((maxEndingIndex-maxStartingIndex)<(currentEndingIndex-currentStartingIndex)){
                    maxIndices = Boolean.FALSE;
                }else if((maxEndingIndex-maxStartingIndex)==(currentEndingIndex-currentStartingIndex)){
                    if(currentStartingIndex<maxStartingIndex){
                        maxIndices = Boolean.FALSE;
                    }
                }
            }else{
                maxIndices = Boolean.TRUE;
            }

            if(maxIndices){
                for(int i = maxStartingIndex;i<=maxEndingIndex;i++){
                    subArray.add(A.get(i));
                }
            }else{
                for(int i = currentStartingIndex;i<=currentEndingIndex;i++){
                    subArray.add(A.get(i));
                }
            }
        }

        return subArray;
    }
}
