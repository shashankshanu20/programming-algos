package personal.programming.algos.twopointers;

import java.util.ArrayList;
import java.util.HashMap;

public class SubArraysDistinctInteger {

    public int solve(ArrayList<Integer> A, int B){
        HashMap<Integer,Integer> counter=new HashMap();
        int start=0;
        int end=0;
        int cnt=0;
        while(end<A.size()){
            counter.put(A.get(end),counter.getOrDefault(A.get(end),0)+1);
            while(counter.size()>B){
                counter.put(A.get(start),counter.get(A.get(start))-1);
                if(counter.get(A.get(start))==0){
                    counter.remove(A.get(start));
                }
                start++;
// cnt++;
            }
            int p=end+1-start;
            cnt+=p;
            end++;
        }
        counter.clear();
        start=0;
        end=0;
        int cnt2=0;
        while(end<A.size()){
            counter.put(A.get(end),counter.getOrDefault(A.get(end),0)+1);
            while(counter.size()>B-1){
                counter.put(A.get(start),counter.get(A.get(start))-1);
                if(counter.get(A.get(start))==0){
                    counter.remove(A.get(start));
                }
                start++;
// cnt++;
            }
            int p=end+1-start;
            cnt2+=p;
            end++;
        }
        return cnt-cnt2;
    }
}
