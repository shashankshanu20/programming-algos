package personal.programming.algos.hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FourSum {
    public ArrayList<ArrayList<Integer>> fourSum(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Map<ArrayList<Integer>, Boolean> map = new HashMap<>();
        for(int i = 0; i<A.size()-3; i++){
            for(int j = i+1; j< A.size()-2; j++){
                int end = A.size()-1;
                int start = j+1;

                while(start<end)
                {
                    if(A.get(start)+A.get(end)==B-(A.get(i)+A.get(j)))
                    {
                        ArrayList<Integer> temp=new ArrayList<Integer>();
                        temp.add(A.get(i));
                        temp.add(A.get(j));
                        temp.add(A.get(start));
                        temp.add(A.get(end));
                        if(!map.containsKey(temp))
                        {
                            map.put(temp, Boolean.TRUE);
                            result.add(temp);
                        }
                        start++;
                        end--;

                    }
                    else if(A.get(start)+A.get(end)<B-(A.get(i)+A.get(j)))
                    {
                        start++;
                    }
                    else {
                        end--;
                    }
                }
            }
        }
        return result;
    }
}
