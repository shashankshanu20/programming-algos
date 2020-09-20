package personal.programming.algos.arrays;

import java.util.ArrayList;
import java.util.Map;

public class Flip {
    public static void main(String []args){

        System.out.println(flip("0111000100010"));
    }

    public static ArrayList<Integer> flip(String A) {
        ArrayList<Integer> result = new ArrayList<>();
        if(A.length()==0){
            return result;
        }
        int l = 0, r = A.length()-1;
        int currentCount = 0;
        int maxCount = currentCount;
        for(int i=0;i<A.length();i++){
            currentCount = A.charAt(i)=='1'?currentCount-1:currentCount+1;
            if(currentCount<0){
                currentCount = 0;
                l = A.charAt(i)=='0'?i:i+1;
            }else{
                if(currentCount>maxCount){
                    maxCount = currentCount;
                    if(result.isEmpty()){
                        result.add(l);
                        result.add(i);
                    }else{
                        result.set(0,l);
                        result.set(1,i);
                    }

                }
            }
        }

        if(!result.isEmpty()){
            result.set(0,result.get(0)+1);
            result.set(1,result.get(1)+1);
        }
        return result;
    }
}
