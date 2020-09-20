package personal.programming.algos.twopointers;

import java.util.List;

public class ArrayThreePointers {
    public static void main(String []args){

    }


    public int minimize(final List<Integer> A, final List<Integer> B, final List<Integer> C) {
        int i = 0;
        int j = 0;
        int k = 0;
        int ans = Integer.MAX_VALUE;
        while(i<A.size() && j<B.size() && k< C.size()){
            ans = Math.min(ans,Math.max(Math.max(Math.abs(A.get(i)-B.get(j)),Math.abs(B.get(j)-C.get(k))),Math.abs(C.get(k)-A.get(i))));
            if(B.get(j) <= A.get(i) && B.get(j) <= C.get(k))
                j++;
            else if(C.get(k) <= B.get(j) && C.get(k)<= A.get(i))
                k++;
            else if(A.get(i) <=C.get(k) && A.get(i) <=B.get(j))
                i++;
        }
        return ans;
    }
}
