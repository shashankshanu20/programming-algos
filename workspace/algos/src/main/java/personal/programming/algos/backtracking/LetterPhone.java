package personal.programming.algos.backtracking;

import java.util.*;

public class LetterPhone {

    public static void main(String []args){
//        System.out.println(letterCombinations("2"));
    }

    public ArrayList<String> letterCombinations(String A) {
        Map<String, List<Character>> characterListMap = new HashMap<>();
        characterListMap.put("0", Arrays.asList('0'));
        characterListMap.put("1", Arrays.asList('1'));
        characterListMap.put("2", Arrays.asList('a','b','c'));
        characterListMap.put("3", Arrays.asList('d','e','f'));
        characterListMap.put("4", Arrays.asList('g','h','i'));
        characterListMap.put("5", Arrays.asList('j','k','l'));
        characterListMap.put("6", Arrays.asList('m','n','o'));
        characterListMap.put("7", Arrays.asList('p','q','r','s'));
        characterListMap.put("8", Arrays.asList('t','u','v'));
        characterListMap.put("9", Arrays.asList('w','x','y','z'));
        ArrayList<String> result = new ArrayList<>();
        combine(A,result,characterListMap,0,0, "");

        return result;
    }

    public void combine(String A, ArrayList<String> result, Map<String, List<Character>> map, int strIndex, int charIndex, String tempStr){

        if(tempStr.length()==A.length()){
            result.add(tempStr);
        }
        if(strIndex>=A.length()){
            return;
        }
        for(int j=charIndex;j<map.get(Character.toString(A.charAt(strIndex))).size();j++ ){
            tempStr+=map.get(Character.toString(A.charAt(strIndex))).get(j);
            combine(A, result, map, strIndex+1, 0,tempStr);
            tempStr=tempStr.substring(0,tempStr.length()-1);

        }
    }


}
