package personal.programming.algos.twopointers;

import java.util.ArrayList;
import java.util.Arrays;

public class CountingSubArray {

    public static void main(String []args){
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(8, 5, 1, 10, 5, 9, 9, 3, 5, 6, 6, 2, 8, 2, 2, 6, 3, 8, 7, 2, 5, 3, 4, 3, 3, 2, 7, 9, 6, 8, 7, 2, 9, 10, 3, 8, 10, 6, 5, 4, 2, 3, 4, 4, 5, 2, 2, 4, 9, 8, 5));
        System.out.println(solve(a,32));
    }

    public static int solve(ArrayList<Integer> A, int B) {
        int sum=0;
        int count=0;
        int start=0;
        int end=0;
        while(end<A.size())
        {
            sum=sum+A.get(end);
            if(sum<B)
            {
                end++;
                count+=(end-start);
            }
            else
            {
                while(sum>=B)
                {
                    sum-=A.get(start);
                    start++;
                }
                end++;
                count+=(end-start);
            }
        }
        return count;
    }
}
