package personal.programming.algos.binarysearch;

import java.util.ArrayList;

public class WoodcuttingMadeEasy {
    public static void main(String []args){
        ArrayList<Integer> A = new ArrayList<>();
//        A.add(20);
//        A.add(15);
//        A.add(10);
//        A.add(17);
//        System.out.println(solve(A, 7));
        A.add(4);
        A.add(42);
        A.add(40);
        A.add(26);
        A.add(46);
        System.out.println(solve(A, 20));
    }

    public static int solve(ArrayList<Integer> A, int B) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(Integer i:A ){
            max = Math.max(i, max);
            min = Math.min(i, min);
        }

//        int totalCut = 0;
//        while (totalCut!=B){
//            for(int i = 0;i<A.size();i++){
//                if(max==A.get(i)){
//                   A.set(i,A.get(i)-1) ;
//                    totalCut++;
//                }
//            }
//            max--;
//        }
//        return max;
        int answer=Integer.MIN_VALUE;
        int s=0,e=max;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            long sum=0;
            Boolean valid = Boolean.FALSE;
            for(int i=0;i<A.size();i++)
            {
                if(A.get(i)>mid)
                    sum+=(A.get(i)-mid);
            }
            if(sum>=(long)B)
                valid = Boolean.TRUE;
            else
                valid = Boolean.FALSE;

            if(valid){
                answer=Math.max((int)mid,answer);
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return answer;
    }
}
