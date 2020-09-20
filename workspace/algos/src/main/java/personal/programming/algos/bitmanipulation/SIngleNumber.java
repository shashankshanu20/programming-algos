package personal.programming.algos.bitmanipulation;

import java.util.Arrays;
import java.util.List;

public class SIngleNumber {
    public static void main(String []args){
        System.out.println(singleNumber(Arrays.asList(12,12,3,24,222,24,222)));
    }

    public static int singleNumber(final List<Integer> A) {
        int ans=0;
        for(int i:A)
        {
            ans^=i;
        }
        return ans;
    }
}
