package personal.programming.algos.strings;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String []args){

        System.out.println(romanToInt("MDCCCIV"));
//        System.out.println(romanToInt("XIV"));
    }

    public static int romanToInt(String A) {
        Map<String,Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("II",2);
        map.put("III",3);
        map.put("IV",4);
        map.put("V",5);
        map.put("VI",6);
        map.put("VII",7);
        map.put("VIII",8);
        map.put("IX",9);
        map.put("X",10);
        map.put("L",50);
        map.put("C", 100);
        map.put("D",500);
        map.put("M",1000);
        int value= 0;
        String prev = "";
        for (int i = 0; i < A.length() ; i++) {
            String current=String.valueOf(A.charAt(i));
            if(i!=0 && map.get(current)>map.get(prev)) {
                value-=map.get(prev);
                value-=map.get(prev);
                value+=map.get(current);
                prev=current;
            }else {
                value+=map.get(current);
                prev=current;
            }
        }
        return value;
    }

}
