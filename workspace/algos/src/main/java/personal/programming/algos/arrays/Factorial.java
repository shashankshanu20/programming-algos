package personal.programming.algos.arrays;

import java.math.BigInteger;

public class Factorial {
    public static void main(String []args){

        System.out.println(solve(100));
    }

    public static String solve(int A) {
        BigInteger factorial = BigInteger.ONE;
        if(A==0||A==1){
            return "1";
        }
        for(int i = A;i>0;i--){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return String.valueOf(factorial);
    }
}
