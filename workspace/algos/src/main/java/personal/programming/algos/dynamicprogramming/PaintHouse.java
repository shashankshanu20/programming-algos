package personal.programming.algos.dynamicprogramming;

import java.util.ArrayList;

public class PaintHouse {

    public int solve(ArrayList<ArrayList<Integer>> A) {
        int n = A.size();
        if(n==0){
            return 0;
        }
        int red = A.get(0).get(0);
        int blue = A.get(0).get(1);
        int green = A.get(0).get(2);

        for(int i=1; i<n; ++i){
            int newred = Math.min(blue, green) + A.get(i).get(0);
            int newblue = Math.min(red, green) + A.get(i).get(1);
            int newgreen = Math.min(blue, red) + A.get(i).get(2);

            red = newred;
            blue = newblue;
            green = newgreen;
        }

        return Math.min(Math.min(red, blue), green);
    }

}
