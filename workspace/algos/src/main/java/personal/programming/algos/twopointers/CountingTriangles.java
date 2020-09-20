package personal.programming.algos.twopointers;

import java.util.ArrayList;
import java.util.Collections;

public class CountingTriangles {
    public static void main(String []args){

    }

    public int nTriang(ArrayList<Integer> A) {
        int res = 0;
        if (A.size() < 3) return res;
        int mod = 1000000007;
        Collections.sort(A);

        for(int i=A.size()-1; i>=0; i--) {
            int j = 0;
            int k = i-1;
            while (j<k) {
                long sum = A.get(j) + A.get(k);
                if (sum > A.get(i)) {
                    res = (res + (k-j)%mod)%mod;
                    k--;
                }
                else {
                    j++;
                }
            }
        }

        return res;
    }
}
