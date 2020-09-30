package personal.programming.algos.hashing;

import java.util.*;

public class Anagrams {
    public static void main(String []args){
        List<String> str = Arrays.asList( "cat", "dog", "god", "tca" );
        System.out.println(anagrams(str));
    }

    public static ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Map<List<String>, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i<A.size(); i++){
            List<String> arr = Arrays.asList(A.get(i).split(""));
            Collections.sort(arr);
            if(map.containsKey(arr)){
                map.get(arr).add(i+1);
            }else{
                ArrayList<Integer> temparr = new ArrayList<>();
                temparr.add(i+1);
                map.put(arr,temparr);
            }
        }

        map.values().stream().forEach(val -> result.add(val));
        return result;
    }
}
