package personal.programming.algos.arrays;

import java.util.ArrayList;

public class PrimeSum {
    public static void main(String []args){

    }

    public ArrayList<Integer> primesum(int A) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=2;i<=A-2;i++){
            if(isPrime(i)==1){
                if(isPrime(A-i)==1){
                    result.add(i);
                    result.add(A-i);
                }
            }
        }
        return result;
    }

    public int isPrime(int A) {
        if(A==1||A==0)
            return 0;
        for(int i = 2;i<=Math.sqrt(A);i++){
            if(A%i==0){
                return 0;
            }
        }

        return 1;
    }

}
