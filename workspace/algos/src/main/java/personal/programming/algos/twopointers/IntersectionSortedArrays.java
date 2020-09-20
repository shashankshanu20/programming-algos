package personal.programming.algos.twopointers;

import java.util.ArrayList;
import java.util.List;

public class IntersectionSortedArrays {
    public static void main(String []args){

    }
    public ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {

        ArrayList<Integer> result = new ArrayList<Integer>();
        int p1 = 0, p2 = 0;
        while(p1 < A.size() && p2 < B.size()){
            if(A.get(p1).compareTo(B.get(p2)) == 0){
                result.add(A.get(p1));
                p1++; p2++;
            }else
            if(A.get(p1).compareTo(B.get(p2)) < 0)
                p1++;
            else
                p2++;
        }
        return result;
    }
}
