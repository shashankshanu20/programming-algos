package personal.programming.algos.bitmanipulation;

import java.util.Arrays;
import java.util.List;

public class SIngleNumberII {
    public static void main(String []args){
        System.out.println(singleNumber(Arrays.asList(23,23,23,44,33,33,33,45,44,44,12,12,12)));
    }

    public static int singleNumber(final List<Integer> A) {
        int first = 0;
        int second = 0;
        for(Integer n:A){
            System.out.println("first : "+first+", n : "+n+", second : "+second);
            System.out.println("first ^ n : "+(first^n)+", ~second : "+(~second));
            first = (first ^ n) & ~second;
            System.out.println("first : "+first);
            System.out.println("second ^ n : "+(second^n)+", ~first : "+(~first));
            second = (second ^ n) & ~first;
            System.out.println("first : "+first);
        }
        return first;
    }
}
