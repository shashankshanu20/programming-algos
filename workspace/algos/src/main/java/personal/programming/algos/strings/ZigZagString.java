package personal.programming.algos.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ZigZagString {
    public static void main(String []args){
        System.out.println(convert("PAYPALISHIRING",3));
    }

    public static String convert(String A, int B) {
        Map<Integer,String> map = new TreeMap<>();
        int row =1;
        Boolean upDirection = Boolean.FALSE;
        for(int i =0 ;i<A.length();i++){
            if(row==B){
                upDirection = Boolean.TRUE;
            }else if(row==1){
                upDirection = Boolean.FALSE;
            }

            if(row==0){
                row =1;
            }
            map.put(row,map.getOrDefault(row,"")+A.charAt(i));
            row = upDirection?row-1:row+1;
        }
        String result = "";
        for(String val:map.values()){
            result += val;
        }
        return result;
    }
}
