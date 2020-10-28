package personal.programming.algos.dynamicprogramming;

import java.util.Arrays;
import java.util.List;

public class BuySellStockII {

    public static void main(String []args){
        BuySellStockII buySellStock = new BuySellStockII();
        List<Integer> a = Arrays.asList(5,8,2, 10);
        System.out.println(buySellStock.maxProfit(a));
    }
    public int maxProfit(final List<Integer> A) {
        if(A.size()<2)
        {
            return 0;
        }
        int totalProfit=0;
        for(int i=1;i<A.size();i++)
        {
            if(A.get(i)>A.get(i-1))
            {
                totalProfit += A.get(i) - A.get(i-1);
            }
        }
        return totalProfit;
    }


}
