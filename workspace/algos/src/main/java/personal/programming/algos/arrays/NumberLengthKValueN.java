package personal.programming.algos.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class NumberLengthKValueN {

    public static void main(String []args){
        ArrayList<Integer> A = new ArrayList<>();
        A.add(0);
        A.add(1);
        A.add(2);
        System.out.println(solve(A, 1, 2));
    }

    public static int solve(ArrayList<Integer> A, int B, int C) {
        int n = A.size();
        int result = 0;

        Set<Integer> aSet = new HashSet<>();
        for (int d : A) {
            aSet.add(d);
        }
        A.clear();
        A.addAll(aSet);

        ArrayList<Integer> cList = new ArrayList<>();
        while(C > 0) {
            cList.add(0, C % 10);
            C /= 10;
        }
        if (cList.size() < B) {
            return 0;
        }
        if (B < cList.size()) {
             C = (int)Math.pow(10, B) - 1;
            cList.clear();
            while(C > 0) {
                cList.add(0, C % 10);
                C /= 10;
            }
            if (aSet.contains(cList.get(cList.size() - 1))) {
                result = 1;  // A = [1, 5, 6, 9], B = 2, C = 99
            }
        }

        boolean isFirst = true;
        int prevCnt = 0;
        for (int digit : cList) {
            int cnt = 0;
            if (isFirst && B > 1) {
                for (int d : A) {
                    cnt += (d > 0 && d < digit) ? 1 : 0;
                }
            } else {
                for (int d : A) {
                    cnt += (d < digit) ? 1 : 0;
                }
            }
            isFirst = false;
            result += cnt * (int)Math.pow(n, --B);
            if (!aSet.contains(digit)) break;
        }
        return result;
    }
}
