package personal.programming.algos.arrays;

import java.util.ArrayList;

public class PerfectPeakInArray {

    public static void main(String []args){
        ArrayList<Integer> A = new ArrayList<>();
        System.out.println(perfectPeak(A));
    }

    public static int perfectPeak(ArrayList<Integer> A) {
        if(A.size()<3){
            return 0;
        }
        int i = 1; int l = A.get(0);
        while(i<A.size()-1) {
            if(A.get(i)>l) {
                l = A.get(i);
                int j = i+1;
                while(j<A.size())
                {
                    if(A.get(j)<l)
                    {
                        i = j;
                        break;
                    }
                    j++;
                }
                if(j==A.size()) {
                    return 1;
                }
            }
            i++;
        }

        return 0;
    }
}
