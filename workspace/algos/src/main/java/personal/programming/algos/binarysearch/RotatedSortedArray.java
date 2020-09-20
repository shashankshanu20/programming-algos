package personal.programming.algos.binarysearch;

import java.util.List;

public class RotatedSortedArray {
    public static void main(String []args){

    }

    public int search(final List<Integer> A, int B){
        int start = 0, end = A.size()-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(A.get(mid)==B) return mid;
            if(A.get(mid)>A.get(start)){
                if(A.get(mid)>B && A.get(start)<=B)
                    end=mid-1;
                else
                    start=mid+1;
            }
            else{
                if(A.get(mid)<B && A.get(end)>=B)
                    start=mid+1;
                else
                    end=mid-1;
            }
        }
        return -1;
    }
}
