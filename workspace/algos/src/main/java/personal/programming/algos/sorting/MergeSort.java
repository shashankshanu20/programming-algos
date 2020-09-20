package personal.programming.algos.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void main(String []args){
        System.out.println("---------- Merge Sort ---------");
        List<Integer> array = Arrays.asList(23, 45, 11, 47, 2, 23, 65, 24);
        System.out.println("Before sorting...");
        System.out.println(array);
        mergeSort(array, 0, array.size()-1);
        System.out.println("After sorting...");
        System.out.println(array);
    }

    public static void mergeSort(List<Integer> array, int start, int end){
        if(start<end){
            int mid = (start+end)/2;
            mergeSort(array, start, mid);
            mergeSort(array, mid+1, end);
            merge(array, start, mid, end);
        }
    }

    public static void merge(List<Integer> array, int start, int mid, int end){
        List<Integer> tempArr = new ArrayList<>();
        int i = start, j = mid+1, k = 0;
        while(i<=mid && j<=end){
            if(array.get(i)<=array.get(j)){
                tempArr.add(array.get(i));
                i++;
            }else{
                tempArr.add(array.get(j));
                j++;
            }
        }

        while(i<=mid){
            tempArr.add(array.get(i));
            i++;
        }

        while (j<=end){
            tempArr.add(array.get(j));
            j++;
        }

        for(i=start;i<=end;i++){
            array.set(i, tempArr.get(i-start));
        }
    }
}
