package personal.programming.algos.twopointers;

import java.util.*;

public class ThreeSumZero {

    public static void main(String []args){
//        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(  1, -4, 0, 0, 5, -5, 1, 0, -2, 4, -4, 1, -1, -4, 3, 4, -1, -1, -3));
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(  2147483647, -2147483648, -2147483648, 0, 1));
        System.out.println(threeSum(a));
    }

    public static ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {
        Collections.sort(A);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Set<ArrayList<Integer>> set = new HashSet<>();
        for(int i = A.size()-1;i>=0;i--){
            int j = 0;
            int k = i-1;
            while(j<k){
                long sum = (long)A.get(i)+(long)A.get(j)+(long)A.get(k);
                if(sum==0){
                    ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(A.get(j),A.get(k),A.get(i)));
                    set.add(arr);
                }
                if(sum<0){
                    j++;
                }else {
                    k--;
                }
            }
        }
        set.stream().forEach(arr->result.add(arr));
        return result;
    }
}
