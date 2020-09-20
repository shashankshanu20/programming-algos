package personal.programming.algos.binarysearch;

import java.util.ArrayList;

public class SortedArrayInsert {

    public static void main(String []args){
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(3);
        A.add(5);
        A.add(6);

        System.out.println(searchInsert(A,2));
    }

    public static int searchInsert(ArrayList<Integer> a, int b) {
        if(a.size()==0){
            return 0;
        }
        if(a.get(0)>b){
            return 0;
        }
        if(a.get(a.size()-1)<b){
            return a.size();
        }
        int start = 0, end = a.size()-1, insertIndex = 0;
        while(start<=end){
            int mid = (start+end)/2;
            if(b==a.get(mid)){
                return mid;
            }else{
                if(b<a.get(mid)){
                    end = mid - 1;
                    insertIndex = end;
                }else{
                    start = mid + 1;
                    insertIndex = start;
                }
            }
        }

        return insertIndex;
    }

}
