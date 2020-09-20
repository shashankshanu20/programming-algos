package personal.programming.algos.arrays;

import java.util.ArrayList;

public class FindPermutation {
    public static void main(String []args){
        String a = "DI";
        System.out.println(findPerm(a,a.length()+1));
    }

    public static ArrayList<Integer> findPerm(final String A, int B) {
        ArrayList<Integer> result = new ArrayList<>();
        if(B==0){
            return result;
        }
        int maxNumber = B;
        int minNumber =1;
        for(int i=-1;i<A.length();i++){
            if(i==-1){
                if(A.charAt(i+1)=='D'){
                    result.add(maxNumber);
                    maxNumber--;
                }else{
                    result.add(minNumber);
                    minNumber++;
                }
            }else{
                if(A.charAt(i)=='D'){
                    result.add(maxNumber);
                    maxNumber--;
                }else if(A.charAt(i)=='I'){
                    result.add(maxNumber);
                    maxNumber--;
                }
            }

        }

        return result;
    }
}
