package personal.programming.algos.twopointers;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String []args){
        ArrayList<Integer> a = new ArrayList<>();
        a.add(5000);
        a.add(5000);
        a.add(5000);
        System.out.println(removeDuplicates(a));
    }


    public static int removeDuplicates(ArrayList<Integer> a) {
        if(a.size()<2){
            return a.size();
        }
        for(int i = 1;i<a.size();){
            if(a.get(i).compareTo(a.get(i-1))==0){
                a.remove(i);
            }else{
                i++;
            }
        }
        return a.size();
    }
}
