package personal.programming.algos.sorting;

import java.util.Arrays;
import java.util.List;

public class QuickSort {
    public static void main(String []args){
        System.out.println("---------- Quick Sort ---------");
        System.out.println("1. Choose a pivot element at each step : ");
        System.out.println("1. a. Normal quick sort : Rightmost element ");
        System.out.println("1. b. Randomized quick sort : choose any random element");
        System.out.println("2. Bring all elements that are smaller than the pivot element to the left & those which are larger to the right.");
        System.out.println("3. Partition the array based on pivot's position.");
        System.out.println("4. Recursively(base case of recursive function should be array length 1) repeat the steps(1 to 3) for the partitions(left & right) of the array created at step 3.");

        List<Integer> array = Arrays.asList(23, 45, 11, 47, 2, 23, 65, 24);
        System.out.println("Before sorting...");
        System.out.println(array);
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(array, 0, array.size()-1);
        System.out.println("After sorting...");
        System.out.println(array);
    }


    private void quickSort(List<Integer> array, int start, int end){
        if(start>=end)
            return;
        int pivot = partition(array, start, end);
        quickSort(array, start, pivot-1);
        quickSort(array, pivot+1, end);
    }

    private int partition(List<Integer> array, int start, int end){
        int startingIndex = start-1;
        int pivotElement = array.get(end);
        for(int i = start; i<end;i++){
            if(array.get(i)<=pivotElement){
                startingIndex++;
                // swap
                int temp = array.get(startingIndex);
                array.set(startingIndex,array.get(i));
                array.set(i, temp);
            }
        }
        //swap pivot
        int temp = array.get(startingIndex+1);
        array.set(startingIndex+1, array.get(end));
        array.set(end, temp);
        return startingIndex+1;
    }
}
