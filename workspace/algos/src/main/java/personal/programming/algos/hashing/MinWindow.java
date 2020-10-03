package personal.programming.algos.hashing;

import java.util.*;

public class MinWindow {

    public static void main(String []args){
        System.out.println(minWindow("ADOBECODEBANC","ABC"));
    }


    public static String minWindow(String A, String B) {
//        String result = "";
//        List<Character> list = new ArrayList<>();
//        for(int i = 0; i<B.length(); i++){
//            list.add(B.charAt(i));
//        }
//        Map<String , Integer> map = new HashMap<>();        //map for strings found indices
//        for(int i = 0; i<A.length();i++){
//            List<Character> tempList = new ArrayList<>(list);
//            int j = i;
//            int startIndex = j;
//            while(j<A.length()&&!tempList.isEmpty()){
//                if(tempList.contains(Character.valueOf(A.charAt(j)))){
//                    if(tempList.size()==B.length()){
//                        startIndex = j;
//                    }
//                    tempList.remove(Character.valueOf(A.charAt(j)));
//                }
//                j++;
//            }
//            if(tempList.isEmpty()){
//                map.put(A.substring(startIndex,j),startIndex);
//            }else{
//                break;
//            }
//        }
//
//        for(String str:map.keySet()){
//            if(result.isEmpty()){
//                result = str;
//            }else{
//                result = str.length()<result.length()?str:str.length()==result.length()?map.get(result)<map.get(str)?result:str:result;
//            }
//        }
//        return result;

        int[] needToFind = new int[256];
        int[] hasFound = new int[256];

        for(int i = 0; i < B.length(); ++i) {
            needToFind[B.charAt(i)]++;
        }

        int count = 0;
        int minWindowSize = Integer.MAX_VALUE;
        int start = 0, end = -1;
        String window = "";

        while (++end < A.length()) {
            char c = A.charAt(end);
            if(++hasFound[c] <= needToFind[c]) {
                count++;
            }

            if(count < B.length()) continue;
            while (hasFound[A.charAt(start)] > needToFind[A.charAt(start)]) {
                hasFound[A.charAt(start++)]--;
            }

            if(end - start + 1 < minWindowSize) {
                minWindowSize = end - start + 1;
                window = A.substring(start, end + 1);
            }
        }
        return window;
    }
}
