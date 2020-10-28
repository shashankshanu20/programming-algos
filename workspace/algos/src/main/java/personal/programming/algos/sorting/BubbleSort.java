package personal.programming.algos.sorting;

import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    public static void main(String []args){
        System.out.println("---------- Bubble Sort ---------");
        List<Integer> array = Arrays.asList(23, 45, 11, 47, 2, 23, 65, 24);
        System.out.println("Before sorting...");
        System.out.println(array);
        bubbleSort(array);
        System.out.println("After sorting...");
        System.out.println(array);
    }

    public static void bubbleSort(List<Integer> array){
        for(int i = 0; i<array.size(); i++){
            Boolean swapped = Boolean.FALSE;
            for(int j = 0; j<array.size()-i-1; j++){
                if(array.get(j)>array.get(j+1)){
                    int temp = array.get(j);
                    array.set(j, array.get(j+1));
                    array.set(j+1, temp);
                    swapped = Boolean.TRUE;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

}
