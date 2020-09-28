package personal.programming.algos.backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Permutations {

    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> ansArr = new ArrayList<>();
        permute(A,0, ansArr);
        return ansArr;
    }

    public static void permute(ArrayList<Integer> A, int start, ArrayList<ArrayList<Integer>> ansArr) {
        Set<Integer> set = new HashSet<>();
        for (int i = start; i < A.size(); i++) {
            if (!set.contains(A.get(i))) {
                swap(A, i, start);
                permute(A, start + 1, ansArr);
                swap(A, i, start);
            }
            set.add(A.get(i));
        }
        if (start == A.size() - 1) {
            ansArr.add((ArrayList<Integer>) A.clone());
        }
    }

    public static void swap(ArrayList<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }
}
