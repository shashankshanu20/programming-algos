package personal.programming.algos.arrays;

import java.math.BigInteger;

public class NextSmallestPallindrome {
    public static void main(String []args){
        System.out.println(solve("1269872"));
    }

    public static String solve(String A) {
        BigInteger bigInteger = new BigInteger(A);

        if(new BigInteger(new StringBuilder(A).reverse().toString()).toString().equals(A)){
            bigInteger = bigInteger.add(BigInteger.ONE);
        }

        while(Boolean.TRUE){
            int length = bigInteger.toString().length();
            //check length
            if(length%2==0){//even
                StringBuilder firstHalf = new StringBuilder(bigInteger.toString().substring(0, length/2));
                String firstHalfStr = firstHalf.toString();
                firstHalf.reverse();
                StringBuilder secondHalf = new StringBuilder(bigInteger.toString().substring(length/2, length));
                if(firstHalf.toString().compareTo(secondHalf.toString())>=0){
                    return firstHalfStr+firstHalf.toString();
                }else if(firstHalf.toString().compareTo(secondHalf.toString())<0){
                    bigInteger = new BigInteger(new BigInteger(firstHalfStr).add(BigInteger.ONE).toString()+secondHalf);
                    firstHalf = new StringBuilder(bigInteger.toString().substring(0, length/2));
                    if(bigInteger.toString().length()%2==0){
                        return firstHalf.toString()+firstHalf.reverse().toString();
                    }
                }
            }else{//odd
                StringBuilder firstHalf = new StringBuilder(bigInteger.toString().substring(0, length/2));
                String firstHalfStr = firstHalf.toString();
                String middleDigit = bigInteger.toString().substring(length/2, length/2+1);
                firstHalf.reverse();
                StringBuilder secondHalf = new StringBuilder(bigInteger.toString().substring(length/2+1, length));
                if(firstHalf.toString().compareTo(secondHalf.toString())>=0){
                    return firstHalfStr+middleDigit+firstHalf.toString();
                }else if(firstHalf.toString().compareTo(secondHalf.toString())<0){
                    if(A.substring(length/2, length).compareTo(middleDigit+secondHalf.toString())<0){
                        return firstHalfStr+middleDigit+firstHalf.toString();
                    }
                    if(middleDigit.equals("9")){
                        middleDigit = "0";
                        bigInteger = new BigInteger(new BigInteger(firstHalfStr).add(BigInteger.ONE).toString()+middleDigit+secondHalf);
                    }else{
                        bigInteger = new BigInteger(firstHalfStr+new BigInteger(middleDigit).add(BigInteger.ONE).toString()+secondHalf);
                    }
                }
            }



//            BigInteger reverse = checkPallindrome(bigInteger);
//            if(bigInteger.compareTo(reverse)==0){
//                bigInteger = reverse;
//                break;
//            }
//
        }
        return bigInteger.toString();
    }

//    public static BigInteger checkPallindrome(BigInteger a){
//
//        BigInteger reverse = BigInteger.ZERO;
//        BigInteger i= new BigInteger(a.abs().toString());
//        while(i.compareTo(BigInteger.ZERO)>0){
//            reverse = reverse.multiply(BigInteger.TEN).add(i.mod(BigInteger.TEN));
//             i = i.divide(BigInteger.TEN);
//        }
//        return reverse;
//    }
}
