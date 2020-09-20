package personal.programming.algos.twopointers;

import java.util.ArrayList;

public class MergeTwoSortedList {

    public static void main(String []args){
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(-1);
        b.add(2);
        merge(a,b);
        System.out.println(a);
    }

    public static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int asize = a.size(), bsize = b.size();
        int firstIndex = 0, secondIndex = 0;
        while(secondIndex<b.size()){
            if(firstIndex>=asize){
                 a.add(b.get(secondIndex)) ;
                 secondIndex++;
            }else{
                if(a.get(firstIndex)<=b.get(secondIndex)){
                    firstIndex++;
                }else if(a.get(firstIndex)>b.get(secondIndex)){
                    a.add(firstIndex, b.get(secondIndex));
                    secondIndex++;
                    firstIndex++;
                    asize++;
                }
            }
        }
    }
}
