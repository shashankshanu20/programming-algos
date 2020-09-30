package personal.programming.algos.hashing;

import java.util.*;

public class DiffKII {

    public static void main(String []args){
        List<Integer> a = Arrays.asList(34, 63, 64, 38, 65, 83, 50, 44, 18, 34, 71, 80, 22, 28, 20, 96, 33, 70, 0, 25, 64, 96, 18, 2, 53, 100, 24, 47, 98, 69, 60, 55, 8, 38, 72, 94, 18, 68, 0, 53, 18, 30, 86, 55, 13, 93, 15, 43, 73, 68, 29);
        System.out.println(diffPossible(a, 97));
    }

    public static int diffPossible(final List<Integer> A, int B) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<A.size(); i++){
            if(set.contains(Math.abs(B+A.get(i)))){
                return 1;
            }else {
                set.add(A.get(i));
            }
        }
        return 0;
    }
}
