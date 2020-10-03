package personal.programming.algos.hashing;

import java.util.HashMap;
import java.util.Map;

public class FractionToDecimal {

    public static void main(String []args){
//        System.out.println((double)2147483648/1);
        System.out.println(fractionToDecimal(-2147483648,-1));
    }

    public static String fractionToDecimal(long A, long B) {
//        Boolean isNegative = Boolean.FALSE;
//        if(A<0||B<0){
//            if(A<0&&B<0){
//
//            }else{
//                isNegative = Boolean.TRUE;
//            }
//        }
//        A = Math.abs(A);
//        B = Math.abs(B);
//        String result = B==1?A+".0":String.valueOf((double) A/B);
//        Map<Character, Integer> map = new HashMap<>();
//        String []temp = result.split("\\.");
//        Boolean isNonTerminating = Boolean.FALSE;
//        int startIndex = 0;
//        int endIndex = 0;
//        if(A==0){
//            return "0";
//        }
//
//        if(temp[1].equals("0")){
//            return isNegative?"-"+temp[0]:temp[0];
//        }else{
//            for(int i=0;i<temp[1].length();i++){
//                if(map.containsKey(temp[1].charAt(i))){
//                    int index = map.get(temp[1].charAt(i));
//                    index++;
//                    int counter = i+1;
//                    Boolean nonTerminating = Boolean.TRUE;
//                    while(index<i){
//                        if(temp[1].charAt(index)!=temp[1].charAt(counter)){
//                            nonTerminating = Boolean.FALSE;
//                            break;
//                        }
//                        index++;
//                        counter++;
//                    }
//                    if(nonTerminating){
//                        isNonTerminating = Boolean.TRUE;
//                        startIndex = map.get(temp[1].charAt(i));
//                        endIndex = i;
//                        break;
//                    }
//                }else{
//                    map.put(temp[1].charAt(i), i);
//                }
//            }
//
//            if(isNonTerminating){
//                if(startIndex!=0){
//                    result = temp[0]+"."+temp[1].substring(0,startIndex)+"("+temp[1].substring(startIndex,endIndex)+")";
//                }else{
//                    result = temp[0]+".("+temp[1].substring(0,endIndex)+")";
//                }
//            }
//            return isNegative?"-"+result:result;
//        }

        long num=Math.abs(A);
        long div=Math.abs(B);

        if(num==0)
            return "0";
        StringBuilder stringBuilder= new StringBuilder();

        if(A<0 && B<0) {

        }
        else if(A<0 || B<0)
            stringBuilder.append("-");


        long initial=num/div;
        stringBuilder.append(initial);
        if(num%div==0)
            return stringBuilder.toString();

        stringBuilder.append(".");
        long rem=num%div;

        Map<Long, Long> map= new HashMap<>();
        long index=0;
        boolean repeat=false;

        while (rem > 0 && !repeat){
            if(map.containsKey(rem)){
                index=map.get(rem);
                repeat=true;
                break;
            }
            else
                map.put(rem,(long)stringBuilder.length());
            rem *=10;

            long temp=rem/div;
            stringBuilder.append(temp);
            rem=rem%div;
        }

        if (repeat) {
            stringBuilder.insert((int) index,"(");
            stringBuilder.append(")");
        }
        return stringBuilder.toString();
    }
}

