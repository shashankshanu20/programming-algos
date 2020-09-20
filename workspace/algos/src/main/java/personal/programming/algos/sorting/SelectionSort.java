package personal.programming.algos.sorting;

import java.util.Arrays;
import java.util.List;

public class SelectionSort {
    public static void main(String []args){
        System.out.println("---------- Selection Sort ---------");
        List<Integer> array = Arrays.asList(23, 45, 11, 47, 2, 23, 65, 24);
        System.out.println("Before sorting...");
        System.out.println(array);
        selectionSort(array);
        System.out.println("After sorting...");
        System.out.println(array);
    }

    public static void selectionSort(List<Integer> array){
        for(int i = 0 ; i<array.size(); i++){
            int min = i;
            for(int j = i+1 ; j<array.size(); j++){
                if(array.get(min)>array.get(j)){
                    min = j;
                }
            }

            if(i!=min){
                int temp = array.get(i);
                array.set(i,array.get(min));
                array.set(min, temp);
            }
        }
    }
}
