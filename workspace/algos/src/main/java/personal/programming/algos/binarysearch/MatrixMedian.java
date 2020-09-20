package personal.programming.algos.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrixMedian {
    public static void main(String []args){

    }

    public int findMedian(ArrayList<ArrayList<Integer>> A) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int r = A.size();
        for (int i = 0; i < r; i++) {
            min = Math.min(min, A.get(i).get(0));
            max = Math.max(max, A.get(i).get(A.get(0).size() - 1));
        }
        int c=A.get(0).size();
        int d = (r * c + 1) / 2;
        int ans=0;
        while (min <= max) {
            int mid = min + (max - min) / 2;
            int place = 0;
            int get = 0;
            for (int i = 0; i < r; i++) {
                get = binarySearch(A.get(i), mid);
                if (get < 0) get = Math.abs(get) - 1;
                else {
                    while (get < A.get(i).size() && A.get(i).get(get) == mid)
                        get++;
                }
                place += get;
            }
            if (place < d) min = mid + 1;
            else max = mid-1;
        }
        return min;
    }

    public static int binarySearch(List<Integer> A, int target) {
        int start = 0, end = A.size()-1, result = -1;
        while(start <= end) {
            int mid = (start + end) / 2;
            if(A.get(mid) == target) {
                result = mid;
                return result;
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
