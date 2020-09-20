package personal.programming.algos.twopointers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreeSum {
    public static void main(String []args){

    }

    public int threeSumClosest(ArrayList<Integer> A, int B) {
        List<Integer> ab = A;
        Collections.sort(ab);
        int result = ab.get(0)+ab.get(1)+ab.get(ab.size()-1);
        for(int i = ab.size()-1;i>0;i--){
            int j = 0;
            int k = i-1;
            while(j<k){
                int sum = ab.get(i)+ab.get(j)+ab.get(k);
                if(sum<B){
                    j++;
                }else{
                    k--;
                }
                if(Math.abs(sum-B)<Math.abs(result-B)){
                   result = sum;
                }
            }
        }
        return result;
    }
}
