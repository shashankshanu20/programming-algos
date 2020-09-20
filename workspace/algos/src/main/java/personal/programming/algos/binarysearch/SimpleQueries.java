package personal.programming.algos.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SimpleQueries {
    public static void main(String []args){
        ArrayList<Integer> A = new ArrayList<>();
//        A.add(1);
//        A.add(2);
//        A.add(4);
        A.addAll(Arrays.asList(39, 99, 70, 24, 49, 13, 86, 43, 88, 74, 45, 92, 72, 71, 90, 32, 19, 76, 84, 46, 63, 15, 87, 1, 39, 58, 17, 65, 99, 43, 83, 29, 64, 67, 100, 14, 17, 100, 81, 26, 45, 40, 95, 94, 86, 2, 89, 57, 52, 91, 45));
        ArrayList<Integer> B = new ArrayList<>();
//        B.add(1);
//        B.add(2);
//        B.add(3);
//        B.add(4);
//        B.add(5);
//        B.add(6);
        B.addAll(Arrays.asList(1221, 360, 459, 651, 958, 584, 345, 181, 536, 116, 1310, 403, 669, 1044, 1281, 711, 222, 280, 1255, 257, 811, 409, 698, 74, 838));
        System.out.println(solve(A,B));
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n=A.size();
        ArrayList<Integer> G = new ArrayList<>();

        if(A.size()==1) {
            return A;
        }

        Collections.sort(A);

        for(int i=0;i<n;i++) {
            G.addAll(A.subList(i,A.size()));
        }

        for(int i=0;i<G.size();i++) {
           G.set(i,multiplyFactors(G.get(i)));
        }

        Collections.sort(G,Collections.reverseOrder());
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<B.size();i++) {
            result.add(G.get(B.get(i)-1));
        }
        return result;
    }

    public static int multiplyFactors(int n)
    {
        long product = 1;
        for (int i = 1; i * i <= n; i++)
        {
            if (n % i == 0)
            {

                // If factors are equal,
                // multiply only once
                if (n / i == i)
                    product = (product * i) % 1000000007;

                    // Otherwise multiply both
                else {
                    product = (product * i) % 1000000007;
                    product = (product * n / i) % 1000000007;
                }
            }
        }
        return (int)product;
    }
}
