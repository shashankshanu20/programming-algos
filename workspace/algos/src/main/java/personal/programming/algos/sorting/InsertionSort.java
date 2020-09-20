package personal.programming.algos.sorting;

import java.util.Arrays;
import java.util.List;

public class InsertionSort {
    public static void main(String []args){
        System.out.println("---------- Insertion Sort ---------");
        List<Integer> array = Arrays.asList(23, 45, 11, 47, 2, 23, 65, 24);
        System.out.println("Before sorting...");
        System.out.println(array);
        insertionSort(array);
        System.out.println("After sorting...");
        System.out.println(array);
    }

    public static void insertionSort(List<Integer> array){
        for(int i = 1; i<array.size(); i++){
            int key = array.get(i);
            int j = i-1;
            while(j>=0&&(array.get(j)>key)){
                array.set(j+1, array.get(j));
                j--;
            }
            array.set(j+1, key);
        }
    }

}
