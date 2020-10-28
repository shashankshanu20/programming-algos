package personal.programming.algos.dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LengthOfLongestSubsequence {

    public static void main(String []args){
        LengthOfLongestSubsequence ofLongestSubsequence = new LengthOfLongestSubsequence();
        List<Integer> A = new ArrayList<>();
        System.out.println(ofLongestSubsequence.longestSubsequenceLength(A));
    }

    public int longestSubsequenceLength(final List<Integer> A) {

        int []increasingArray = new int[A.size()];
        Arrays.fill(increasingArray,1);
        int []decreasingArray = new int[A.size()];
        Arrays.fill(decreasingArray,1);
        if(A.size()==0)
            return 0;

        for(int i = 1; i < A.size(); i++) {
            for(int j = 0; j < i; j++) {
                if (A.get(i) > A.get(j)) {
                    increasingArray[i] = Math.max(increasingArray[i], 1 + increasingArray[j]);
                }
            }
        }

        for(int i = A.size() - 2; i >= 0; i--) {
            for(int j = A.size() - 1; j > i; j--) {
                if(A.get(i) > A.get(j)) {
                    decreasingArray[i] = Math.max(decreasingArray[i], 1 + decreasingArray[j]);
                }
            }
        }

        int maxLength=1;
        for(int i=0;i<A.size();i++){
            maxLength = Math.max(maxLength, increasingArray[i]+ decreasingArray[i]);
        }
        return maxLength-1;
    }

}
