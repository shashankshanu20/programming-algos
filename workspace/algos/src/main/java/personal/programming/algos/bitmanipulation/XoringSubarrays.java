package personal.programming.algos.bitmanipulation;

import java.util.ArrayList;

public class XoringSubarrays {
    public static void main(String []args){

    }

    public int solve(ArrayList<Integer> A)
    {
        int result=0;
        for(int i=0;i<A.size();i++)
        {
            int count = (i+1)*(A.size()-i);
            if(count %2!=0)
                result ^=A.get(i);
        }
        return result;
    }
}
