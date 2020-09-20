package personal.programming.algos.binarysearch;

import java.util.Arrays;
import java.util.List;

public class CountElementOccurence {
    public static void main(String []args){
        List<Integer> a = Arrays.asList(23,34,55,55,78, 100);
        System.out.println(findCount(a,55));
    }

    public static int findCount(final List<Integer> A, int B) {
        int startIndex = binarySearch(A,B,Boolean.TRUE);
        if(startIndex==-1){
            return 0;
        }else{
            int lastIndex = binarySearch(A,B,Boolean.FALSE);
            return lastIndex-startIndex + 1;
        }
    }

    public static int binarySearch(List<Integer> A, int target, boolean firstMatch ) {

        int start = 0, end = A.size()-1, result = -1;

        while(start <= end) {
            int mid = (start + end) / 2;

            if(A.get(mid) == target) {
                result = mid;
                if(firstMatch){
                    end = mid-1;
                }else{
                    start = mid + 1;
                }
            }
            else if(A.get(mid) < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return result;
    }
}

