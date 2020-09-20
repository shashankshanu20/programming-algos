package personal.programming.algos.twopointers;

import java.util.ArrayList;

public class RemoveDuplicatesII {
    public static void main(String []args){
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1000);
        a.add(1000);
        a.add(1000);
        a.add(1000);
        a.add(1001);
        a.add(1002);
        a.add(1003);
        a.add(1003);
        a.add(1004);
        a.add(1010);
        System.out.println(removeDuplicates(a));
    }

    public static int removeDuplicates(ArrayList<Integer> a) {
        int size = a.size();
        int i = 1;
        int count = 1;
        while (i<size){
            if(count==2&&a.get(i).compareTo(a.get(i-1))==0){
                a.remove(i);
                size--;
            }else if(a.get(i).compareTo(a.get(i-1))==0){
                count++;
                i++;
            }else if(a.get(i).compareTo(a.get(i-1))!=0){
                count = 1;
                i++;
            }
        }
        return size;
    }
}
