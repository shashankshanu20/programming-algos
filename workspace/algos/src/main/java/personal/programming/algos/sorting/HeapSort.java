package personal.programming.algos.sorting;

import java.util.Arrays;
import java.util.List;

public class HeapSort {
    public static void main(String []args){
        System.out.println("---------- Heap Sort ---------");
        System.out.println("Since a Binary Heap is a Complete Binary Tree, " +
                "\nit can be easily represented as array and array based representation " +
                "\nis space efficient. If the parent node is stored at index I, the " +
                "\nleft child can be calculated by 2 * I + 1 " +
                "\nand right child by 2 * I + 2");
        System.out.println("1. Build a max heap from the input data.");
        System.out.println("2. At this point, the largest item is stored at the root of the heap. " +
                "\nReplace it with the last item of the heap followed by reducing the size of heap by 1. " +
                "\nFinally, heapify the root of tree.");
        System.out.println("3. Repeat above steps while size of heap is greater than 1.");
        List<Integer> array = Arrays.asList(23, 45, 11, 47, 2, 23, 65, 24);
        System.out.println("Before sorting...");
        System.out.println(array);
        heapSort(array);
        System.out.println("After sorting...");
        System.out.println(array);
    }

    public static void heapSort(List<Integer> array){
        // Build heap (rearrange array)
        for (int i = (array.size() / 2) - 1; i >= 0; i--)
            heapify(array, array.size(), i);

        // One by one extract an element from heap
        for (int i=array.size()-1; i>0; i--)
        {
            // Move current root to end
            int temp = array.get(0);
            array.set(0, array.get(i));
            array.set(i, temp);

            // call max heapify on the reduced heap
            heapify(array, i, 0);
        }
    }

    public static void heapify(List<Integer> array, int n, int i){
        int maxElement = i;    //taking root element as max
        int leftChild = 2*i+1;   //left child of root node
        int rightChild = 2*i+2;  //right child of root node

        //compare left child & root
        if(leftChild < n && array.get(leftChild)>array.get(maxElement)){
            maxElement = leftChild;
        }

        //compare right child & root
        if(rightChild < n && array.get(rightChild)>array.get(maxElement)){
            maxElement = rightChild;
        }

        //if maxelement is not root
        if(maxElement!=i){
            int temp = array.get(i);
            array.set(i, array.get(maxElement));
            array.set(maxElement, temp);
            heapify(array, n, maxElement);  //heapifying sub tree
        }

    }
}
