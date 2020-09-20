package personal.programming.algos.arrays;

import java.util.ArrayList;

public class Partition {
    public static void main(String []args){
        ArrayList<Integer> arrayList = new ArrayList();
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(3);
//        arrayList.add(0);
//        arrayList.add(3);
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(-1);
        arrayList.add(0);
        System.out.println(solve(arrayList.size(), arrayList));
    }

    public static int solve(int A, ArrayList<Integer> B) {
        int totalSum =0 ;
        for(Integer i :B){
            totalSum = totalSum + i;
        }

        if(totalSum%3!=0){
            return 0;
        }

        int partition = totalSum/3;
        int firstSum = 0,secondSum = 0, thirdSum=0;
        int count = 0;
        for(int i =0;i<A;i++){
            firstSum = firstSum +B.get(i);
            if(firstSum==partition){
                secondSum = 0;
                for(int j = i+1;j<A-1;j++){
                    secondSum = secondSum+B.get(j);
                    if(secondSum == partition){
                        if((totalSum - (firstSum + secondSum))==partition){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
