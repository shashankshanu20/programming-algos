package personal.programming.algos.twopointers;

import java.util.ArrayList;
import java.util.Collections;

public class REmoveElementFromArray {

    public static void main(String []args){

    }

    public int removeElement(ArrayList<Integer> a, int b) {

//        a.removeAll(Collections.singleton(b));
//        return a.size();

        int i=0, j=0;
        for(;i<a.size() && j<a.size();i++)
        {
            if(a.get(i) != b)
            {
                a.set(j,a.get(i));
                j++;

            }
        }
        return j;
    }
}
