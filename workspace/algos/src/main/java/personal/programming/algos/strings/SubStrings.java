package personal.programming.algos.strings;

import java.util.HashMap;
import java.util.Map;

public class SubStrings {

    public static void main(String []args){

    }

    public int solve(String A) {
        Map<Character, Boolean> map= new HashMap<>();
        map.put('a',Boolean.TRUE);
        map.put('e',Boolean.TRUE);
        map.put('i',Boolean.TRUE);
        map.put('o',Boolean.TRUE);
        map.put('u',Boolean.TRUE);
        map.put('A',Boolean.TRUE);
        map.put('E',Boolean.TRUE);
        map.put('I',Boolean.TRUE);
        map.put('O',Boolean.TRUE);
        map.put('U',Boolean.TRUE);
        int count = 0;
        A=A.trim();
        for(int i = 0; i<A.length();i++){
            if(map.containsKey(A.charAt(i))){
                count = count + A.substring(i).length();
            }
        }
        return count%10003;
    }
}
