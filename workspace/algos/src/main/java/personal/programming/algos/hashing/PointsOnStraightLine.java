package personal.programming.algos.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PointsOnStraightLine {
    public static void main(String []args){

    }

    public int maxPoints(ArrayList<Integer> a, ArrayList<Integer> b) {
        if(a.size()==0)
            return 0;
        int maxCount = 0;
        Map<Double,Integer> map = new HashMap<>();
        for(int i=0;i<a.size();i++)
        {
            for(int j=0;j<a.size();j++)
            {
                if(i!=j)
                {
                    int x1 = a.get(i);
                    int y1 = b.get(i);
                    int x2 = a.get(j);
                    int y2 = b.get(j);
                    if((x2-x1)==0)
                    {
                        map.put((double)Integer.MAX_VALUE,map.getOrDefault((double)Integer.MAX_VALUE,0)+1);
                    }
                    else
                    {
                        double slope =  (y2-y1)/((x2-x1)*1.0);
                        map.put(slope, map.getOrDefault(slope,0)+1);
                    }
                }
            }
            for(Integer num:map.values())
            {
                if(num>maxCount)
                    maxCount = num;
            }
            map.clear();
        }
        return maxCount+1;
    }
}
