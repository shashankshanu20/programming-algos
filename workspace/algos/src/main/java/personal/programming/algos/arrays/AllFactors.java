package personal.programming.algos.arrays;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Collections;

public class AllFactors {
    public static void main(String []args){

    }

    public ArrayList<Integer> allFactors(int A) {
        ArrayList<Integer> resultSet =  new ArrayList<>();
        resultSet.add(1);
        for(int i=2;i<=Math.sqrt(A);i++){
            if(A%i==0){
                resultSet.add(i);
                if(i!=Math.sqrt(A)){
                    resultSet.add(A/i);
                }
            }
        }
        resultSet.add(A);
        Collections.sort(resultSet);
        return resultSet;
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

    public ArrayList<Integer> sieve(int A) {
        ArrayList<Integer> result =  new ArrayList<>();
        ArrayList<Integer> primeIndices =  new ArrayList<>();

        for(int i=0;i<A;i++){
            primeIndices.add(1);
        }
        primeIndices.set(0,0);
        primeIndices.set(1,0);

        for(int i = 2; i<+Math.sqrt(A); i++){
            if(primeIndices.get(i)==1){
                for(int j = 2;i*j<=A;j++){
                    primeIndices.set(i*j, 0);
                }
            }
        }

        for(Integer i:primeIndices){
            if(i==1){
                result.add(i);
            }
        }
        return result;
    }

    public String findDigitsInBinary(int A) {
        StringBuilder result= new StringBuilder();
        for(int i=A;i>=0;i=i/2){
            result.append( i%2==0?1:0);
        }


        return result.reverse().toString();
    }


}
