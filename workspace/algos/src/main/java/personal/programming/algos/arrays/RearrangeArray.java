package personal.programming.algos.arrays;

import java.util.ArrayList;

public class RearrangeArray {
    public static void main(String []args){

    }

    public void arrange(ArrayList<Integer> a) {
        for(int i = 0; i < a.size(); i++){
            a.set(i, a.get(i) + (a.get(a.get(i))%(a.size()))*a.size());
        }

        for(int i = 0; i < a.size(); i++){
            a.set(i, a.get(i)/a.size());
        }
    }

}
