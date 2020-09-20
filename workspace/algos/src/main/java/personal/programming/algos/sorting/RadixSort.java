package personal.programming.algos.sorting;

import java.util.Arrays;
import java.util.List;

public class RadixSort {
    public static void main(String []args){
        System.out.println("---------- Radix Sort ---------");
        List<Integer> array = Arrays.asList(23, 45, 11, 47, 2, 23, 65, 24);
        System.out.println("Before sorting...");
        System.out.println(array);
        radixSort(array);
        System.out.println("After sorting...");
        System.out.println(array);
    }

    public static void radixSort(List<Integer> array){
        // Find the maximum number to know number of digits
        int maxElement = array.get(0);
        //finding max element
        for(int n:array){
            if(maxElement<n){
                maxElement = n;
            }
        }

        // Do counting sort for every digit. Note that instead
        // of passing digit number, exp is passed. exp is 10^i
        // where i is current digit number
        for (int exp = 1; maxElement/exp > 0; exp *= 10)
            countSort(array, array.size(), exp);
    }

    public static void countSort(List<Integer> array, int size, int exp){
        int []output = new int[array.size()];

//        int maxElement = array.get(0);
        //finding max element
//        for(int n:array){
//            if(maxElement<n){
//                maxElement = n;
//            }
//        }

        //array for storing count
        int []count = new int[10];
        //setting all indices value to 0
        for(int i=0;i<count.length;i++){
            count[i] = 0;
        }
        //checking count of each element
        for(int n:array){
            count[(n/exp)%10]++;
        }
        //storing cumulative count of each element
        for(int i=1;i<count.length;i++){
            count[i] = count[i]+count[i-1];
        }

        for (int i = size - 1; i >= 0; i--)
        {
            output[count[(array.get(i)/exp)%10] - 1] = array.get(i);
            count[(array.get(i)/exp)%10]--;
        }

        // Copy the sorted elements into original array
        for (int i = 0; i < array.size(); i++) {
            array.set(i, output[i]);
        }
    }
}
