package personal.programming.algos.twopointers;

import java.util.ArrayList;

public class ContainerWithModtWater {

    public static void main(String []args){

    }

    public static int maxArea(ArrayList<Integer> A) {
//        int maxArea = 0;
//        int windowSize = 1;
//        int start = 0;
//        while (windowSize<A.size()){
//            while(start+windowSize<A.size()){
//                int base = windowSize;
//                int height = Math.min(A.get(start), A.get(start+windowSize));
//                maxArea = Math.max(base*height,maxArea);
//                start++;
//            }
//            windowSize++;
//            start =0;
//        }
//        return maxArea;

        int left = 0 ;
        int right = A.size() -1 ;
        int maxArea = 0;

        while(left < right){
            maxArea = Math.max(maxArea , Math.min(A.get(left) ,A.get(right))*(right-left));
            if(A.get(left) < A.get(right)){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}
