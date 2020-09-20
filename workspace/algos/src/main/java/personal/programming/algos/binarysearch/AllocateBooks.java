package personal.programming.algos.binarysearch;

import java.util.ArrayList;

public class AllocateBooks {
    public static void main(String []args){
        ArrayList<Integer> a = new ArrayList<>();
//        a.add(12);
//        a.add(34);
//        a.add(67);
//        a.add(90);
        a.add(5);
        a.add(17);
        a.add(100);
        a.add(11);
//            a.add(31);
//            a.add(14);
//            a.add(19);
//            a.add(75);
        System.out.println(books(a, 4));
    }

    public static int books(ArrayList<Integer> A, int B) {
        int minPages = 0;
        int maxPages = 0;
        if(A.size()>B){
            return -1;
        }

        for(Integer i:A){
            minPages = Math.max(i, minPages);
            maxPages += i;
        }
        int result = -1;
        while (minPages<=maxPages){
            int randomPages = (minPages + maxPages)/2;
            int maxCount = 0, students = 1;
            for (Integer i : A){
                if(maxCount+i <= randomPages ){
                    maxCount += i;
                }else{
                    students++;
                    maxCount = i;
                    if(students>B){
                        break;
                    }
                }
            }

            if(students<=B){
                result = randomPages;
                maxPages = randomPages-1;
            }else{
                minPages = randomPages+1;
            }
        }
        return result;
    }

}
