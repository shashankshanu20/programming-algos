package personal.programming.algos.binarysearch;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {
    public static void main(String []args){
//        int []a = {34,23,65,75,98,22};
        List<Integer> a = Arrays.asList(23,34,55,61,78, 100);
        System.out.println(binarySearch(a,61));
    }


    public static int binarySearch(List<Integer> A,int target) {

        //set stating and ending index
        int start = 0, end = A.size()-1, result = -1;

        while(start <= end) {
            // take mid of the list
            int mid = (start + end) / 2;

            // we found a match
            if(A.get(mid) == target) {
                result = mid;
                return result;
            }
            // go on right side
            else if(A.get(mid) < target) {
                start = mid + 1;
            }
            // go on left side
            else {
                end = mid - 1;
            }
        }
        // element is not present in list
        return result;
    }
}
