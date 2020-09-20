package personal.programming.algos.twopointers;

import java.util.ArrayList;

public class SortByColor {

    public static void main(String []args){

    }

    public void sortColors(ArrayList<Integer> a) {
        int l=0,m=0,h=a.size()-1;
        while(m<=h)
        {
            if(a.get(m)==0){
                int temp = a.get(l);
                a.set(l, a.get(m));
                a.set(m, temp);
                l++;
                m++;
            }
            else if(a.get(m)==1){
                m++;
            }
            else{
                int temp = a.get(m);
                a.set(m, a.get(h));
                a.set(h, temp);
                h--;
            }
        }
    }

}
