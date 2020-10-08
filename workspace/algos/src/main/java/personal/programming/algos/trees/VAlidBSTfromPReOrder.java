package personal.programming.algos.trees;

import java.util.ArrayList;
import java.util.Stack;

public class VAlidBSTfromPReOrder {
//7, 7, 10, 10, 9, 5, 2, 8
    public int solve(ArrayList<Integer> A) {
        int a=0,b=1,c=2;

        if(A.size()<=2)
            return 1;

        while(c<A.size())
        {
            if(A.get(a)<A.get(b)&&A.get(b)>A.get(c)&&A.get(c)<A.get(a))
                return 0;

            a++;
            b++;
            c++;
        }
        return 1;
    }
}
