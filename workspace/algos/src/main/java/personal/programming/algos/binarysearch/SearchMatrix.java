package personal.programming.algos.binarysearch;

import java.util.ArrayList;
import java.util.List;

public class SearchMatrix {
    public static void main(String []args){
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<Integer> aa = new ArrayList<>();
        aa.add(3);
        A.add(aa);
        aa = new ArrayList<>();
        aa.add(29);
        A.add(aa);
        aa = new ArrayList<>();
        aa.add(36);
        A.add(aa);
        aa = new ArrayList<>();
        aa.add(63);
        A.add(aa);
        aa = new ArrayList<>();
        aa.add(67);
        A.add(aa);
        aa = new ArrayList<>();
        aa.add(72);
        A.add(aa);
        aa = new ArrayList<>();
        aa.add(74);
        A.add(aa);
        aa = new ArrayList<>();
        aa.add(78);
        A.add(aa);
        aa = new ArrayList<>();
        aa.add(85);
        A.add(aa);
        System.out.println(searchMatrix(A,74));
    }

    public static int searchMatrix(ArrayList<ArrayList<Integer>> A, int B) {
        int row = 0, startRow = 0, endRow = A.size(), result = 0;
        row = A.size()/2;
        while(row>=startRow&&row<endRow){
            // lies in the range in the current row
            if(B>=A.get(row).get(0)&&B<=A.get(row).get(A.get(row).size()-1)){
                return binarySearch(A.get(row),B)==-1?0:1;
            }
            // can lie in previous row
            else if (B<A.get(row).get(0)){
                endRow = row;
                row--;
            }
            //can lie in next row
            else if(B>A.get(row).get(A.get(row).size()-1)){
                startRow = row;
                row++;
            }
        }
        return result;
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

