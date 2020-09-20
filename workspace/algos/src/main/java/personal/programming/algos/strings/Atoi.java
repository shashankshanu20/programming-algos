package personal.programming.algos.strings;

import java.math.BigInteger;

public class Atoi {
    public static void main(String []args){
        System.out.println(atoi("++954 09"));
    }

    public static int atoi(final String A) {
        String str= A.trim();
        if(str.isEmpty()){
            return 0;
        }
        if(str.charAt(0)!='+'&&str.charAt(0)!='-'&&!Character.isDigit(str.charAt(0))){
            return 0;
        }

        int i = Character.isDigit(str.charAt(0))?0:1;
        if(!Character.isDigit(str.charAt(i))){
            return 0;
        }
        int startIndex = i;
        int result = Character.isDigit(str.charAt(i))?Character.getNumericValue(str.charAt(i)):0;
        Boolean hasGarbageCharacters = Boolean.FALSE;
        for(;i<str.length();i++){
            if(!Character.isDigit(str.charAt(i))){
                hasGarbageCharacters = Boolean.TRUE;
//                result = Integer.parseInt(str.substring(startIndex,i));
                if(str.charAt(0)=='-'){
                    result = new BigInteger("-"+str.substring(startIndex,i)).compareTo(new BigInteger(String.valueOf(Integer.MIN_VALUE)))==-1?Integer.MIN_VALUE:-Integer.parseInt(str.substring(startIndex,i));
                }else{
                    result = new BigInteger(str.substring(startIndex,i)).compareTo(new BigInteger(String.valueOf(Integer.MAX_VALUE)))==-1?Integer.parseInt(str.substring(startIndex,i)):Integer.MAX_VALUE;
                }
                break;
            }
        }
        if(!hasGarbageCharacters){
            if(str.charAt(0)=='-'){
                result = new BigInteger("-"+str.substring(startIndex)).compareTo(new BigInteger(String.valueOf(Integer.MIN_VALUE)))==-1?Integer.MIN_VALUE:-Integer.parseInt(str.substring(startIndex));
            }else{
                result = new BigInteger(str.substring(startIndex)).compareTo(new BigInteger(String.valueOf(Integer.MAX_VALUE)))==-1?Integer.parseInt(str.substring(startIndex)):Integer.MAX_VALUE;
            }

        }
        return result;
    }
}
