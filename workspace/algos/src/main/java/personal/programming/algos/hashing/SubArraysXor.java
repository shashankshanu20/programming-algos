package personal.programming.algos.hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class SubArraysXor {


    public static void main(String []args){

    }

    public int solve(ArrayList<Integer> A, int B) {
        ArrayList<Integer> list = new ArrayList();
        list.add(A.get(0));
        for(int i=1;i<A.size();i++){
            list.add(list.get(i-1)^A.get(i));
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        int result =0 ;
        for(int i=0;i<A.size();i++){
            int temp = list.get(i)^B;
            if(map.containsKey(temp)){
                result +=map.get(temp);
            }
            if(B==list.get(i)){
                result++;
            }
            if(map.containsKey(list.get(i))){
                map.put(list.get(i),map.get(list.get(i))+1);
            }
            else{
                map.put(list.get(i),1);
            }
        }
        return result;
    }
}
