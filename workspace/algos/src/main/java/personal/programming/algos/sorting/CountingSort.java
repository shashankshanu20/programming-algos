package personal.programming.algos.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingSort {
    public static void main(String []args){
        System.out.println("---------- Counting Sort ---------");
        List<Integer> array = Arrays.asList(23, 45, 11, 47, 2, 23, 65, 24);
        System.out.println("Before sorting...");
        System.out.println(array);
        countingSort(array);
        System.out.println("After sorting...");
        System.out.println(array);
    }

    public static void countingSort(List<Integer> array){
        int []output = new int[array.size()];

        int maxElement = array.get(0);
        //finding max element
        for(int n:array){
            if(maxElement<n){
                maxElement = n;
            }
        }

        //array for storing count
        int []count = new int[maxElement+1];
        //setting all indices value to 0
        for(int i=0;i<count.length;i++){
            count[i] = 0;
        }
        //checking count of each element
        for(int n:array){
            count[n]++;
        }
        //storing cumulative count of each element
        for(int i=1;i<count.length;i++){
            count[i] = count[i]+count[i-1];
        }

        for(int n:array){
            output[count[n] - 1] = n;
            count[n]--;
        }

        // Copy the sorted elements into original array
        for (int i = 0; i < array.size(); i++) {
            array.set(i, output[i]);
        }
    }
}
