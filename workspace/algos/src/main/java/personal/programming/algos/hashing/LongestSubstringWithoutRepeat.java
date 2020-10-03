package personal.programming.algos.hashing;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeat {

    public static void main(String []args){
        System.out.println(lengthOfLongestSubstring("bbbbb"));
    }

    public static int lengthOfLongestSubstring(String A) {
        int maxLength = 0;
        for(int i = 0; i<A.length(); i++){
            Set<Character> set = new HashSet<>();
            int j = i;
            while (j<A.length()&&!set.contains(A.charAt(j))){
                set.add(A.charAt(j));
                j++;
            }
            maxLength = Math.max(set.size(),maxLength);
        }
        return maxLength;
    }
}
