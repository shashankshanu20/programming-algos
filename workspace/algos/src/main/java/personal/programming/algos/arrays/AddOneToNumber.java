package personal.programming.algos.arrays;

import java.util.ArrayList;

public class AddOneToNumber {
    public static void main(String []args){
        ArrayList<Integer> arrayList = new ArrayList();
//        arrayList.add(-2);
//        arrayList.add(1);
//        arrayList.add(-3);
//        arrayList.add(4);
//        arrayList.add(-1);
//        arrayList.add(2);
//        arrayList.add(1);
//        arrayList.add(-5);
//        arrayList.add(4);

        System.out.println(maxArr(arrayList));
    }

    public static int maxArr(ArrayList<Integer> A) {
        int maxAbsDiff = 0 ;
//        int i = 0,j=A.size()-1;
//        while(i<j){
//            int absDiff = computeFunction(A, i, j);
//            if(absDiff>maxAbsDiff){
//                maxAbsDiff = absDiff;
//            }
//        }

        for(int i =0;i<A.size();i++){
            for(int j=0;j<A.size();j++){
                maxAbsDiff = maxAbsDiff>computeFunction(A,i,j)?maxAbsDiff:computeFunction(A,i,j);
            }
        }
        return maxAbsDiff;
    }

    public static int computeFunction(ArrayList<Integer> A, int i, int j){
        return Math.abs(A.get(i)-A.get(j))+Math.abs(i-j);
    }
}
