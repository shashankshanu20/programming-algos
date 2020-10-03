package personal.programming.algos.hashing;

import java.util.*;

public class SubstringConcatenation {

    public static void main(String []args){
        //"barfoothefoobarman"
        System.out.println(findSubstring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", Arrays.asList("aaa", "aaa", "aaa", "aaa", "aaa" )));
    }

    public static ArrayList<Integer> findSubstring(String A, final List<String> B) {
        ArrayList<Integer> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        B.stream().forEach(str-> map.put(str,1));
        int length = B.get(0).length();
        if(A.length()<length){
            return result;
        }
        for(int i = 0; i+length-1<A.length() ;i++){
            if(map.containsKey(A.substring(i,i+length))){
                int j = i;
                ArrayList<String> list = new ArrayList<>(B);
                while(list.contains(A.substring(j,j+length))){
                    list.remove(A.substring(j,j+length));
                    j =j+length;
                    if(j>=A.length()||j+length>A.length()){
                     break;
                    }
                    if(!map.containsKey(A.substring(j, j+length))){
                        break;
                    }
                }

                if(list.isEmpty()){
                    result.add(i);
                }
                list.clear();
            }
        }
        return result;
    }
}
