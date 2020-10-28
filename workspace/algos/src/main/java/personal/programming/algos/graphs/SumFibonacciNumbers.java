package personal.programming.algos.graphs;

import java.util.ArrayList;

public class SumFibonacciNumbers {






    public int fibsum(int A) {
        ArrayList<Integer> fibonacciArray = new ArrayList<>();
        fibonacciArray.add(0);
        fibonacciArray.add(1);
        int i=2, val;

        while (true) {
            val = fibonacciArray.get(i - 1) + fibonacciArray.get(i - 2);
            if (val>A)
                break;
            fibonacciArray.add(val);
            i++;
        }

        int count = 0;
        int j = fibonacciArray.size()-1;

        while(A>0) {
            count += (A / fibonacciArray.get(j));
            A = A%(fibonacciArray.get(j));
            j--;
        }
        return count;
    }

}
