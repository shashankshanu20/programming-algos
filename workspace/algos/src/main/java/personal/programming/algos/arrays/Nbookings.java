package personal.programming.algos.arrays;

import java.util.ArrayList;
import java.util.TreeMap;

public class Nbookings {
    public static void main(String []args){

    }

    public static boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        TreeMap<Integer,Integer> entryLogMap = new TreeMap<Integer,Integer>();
        for(int i=0;i<arrive.size();i++)
        {
            entryLogMap.put(arrive.get(i),entryLogMap.getOrDefault(arrive.get(i),0)+1);
            entryLogMap.put(depart.get(i),entryLogMap.getOrDefault(depart.get(i),0)-1);
        }

        int total=0;
        for(int i : entryLogMap.values())
        {

            total = i + total;
            if(total > K)
            {
                return false;
            }
        }
        return true;
    }
}
