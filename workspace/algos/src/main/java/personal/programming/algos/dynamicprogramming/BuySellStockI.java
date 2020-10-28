package personal.programming.algos.dynamicprogramming;

import java.util.List;

public class BuySellStockI {

    public int maxProfit(final List<Integer> A) {
//        int maxProfit = 0;
//        for(int i = 0; i<A.size() ;i++){
//            for(int j = i+1; j<A.size() ;j++){
//                if(A.get(j)-A.get(i)>maxProfit){
//                    maxProfit = A.get(j)-A.get(i);
//                }
//            }
//        }
//        return maxProfit;
        if (A.size() <= 1) {
            return 0;
        }
        int maxProfit = 0;
        int startIndex = 0;

        for (int i = 1; i < A.size(); i++) {
            if (A.get(i) > A.get(startIndex) && A.get(i)-A.get(startIndex) > maxProfit) {
                maxProfit = A.get(i)-A.get(startIndex);
            }
            else if (A.get(i) < A.get(startIndex)) {
                startIndex = i;
            }
        }
        return maxProfit;
    }
}
