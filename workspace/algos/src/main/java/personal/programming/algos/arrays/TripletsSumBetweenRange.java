package personal.programming.algos.arrays;

import java.util.ArrayList;
import java.util.List;

public class TripletsSumBetweenRange {
    public static void main(String []args){

        ArrayList<String> A = new ArrayList<>();
        A.add("2.673662");
        A.add("2.419159");
        A.add("0.573816");
        A.add("2.454376");
        A.add("0.403605");
        A.add("2.503658");
        A.add("0.806191");
        System.out.println(solve(A));
    }

    public static int solve(ArrayList<String> A) {
        if(A.size()<3){
            return 0;
        }
        double first = Double.parseDouble(A.get(0));
        double second = Double.parseDouble(A.get(1));
        double third = Double.parseDouble(A.get(2));
        if(1<(first+second+third)&&(first+second+third)<2){
            return 1;
        }
        for(int i=3;i<A.size();i++){
            if(1<(first+second+third)&&(first+second+third)<2){
                return 1;
            }else{
                if((first+second+third)>=2){
                    if(first>second && first>third)
                        first = Double.parseDouble(A.get(i));
                    else if(second>third && second>first)
                        second = Double.parseDouble(A.get(i));
                    else
                        third = Double.parseDouble(A.get(i));

                }else{
                    if(first<second && first<third)
                        first = Double.parseDouble(A.get(i));
                    else if(second<third && second<first)
                        second = Double.parseDouble(A.get(i));
                    else
                        third = Double.parseDouble(A.get(i));
                }
            }
        }
        if(1<(first+second+third)&&(first+second+third)<2){
            return 1;
        }
        return 0;
    }
}
