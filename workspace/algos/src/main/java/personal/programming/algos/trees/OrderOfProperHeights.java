package personal.programming.algos.trees;

import java.util.ArrayList;
import java.util.Collections;

public class OrderOfProperHeights {
    public ArrayList<Integer> order(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n=A.size();
        ArrayList<Integer> C = new ArrayList<Integer>(A);
        ArrayList<Integer> D = new ArrayList<Integer>();
        Collections.sort(A);
        D.add(A.get(n-1));
        for(int i=n-2;i>=0;i--){
            int k=A.get(i);
            D.add(B.get(C.indexOf(k)),k);
        }
        return D;
    }
}
