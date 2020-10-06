package personal.programming.algos.heapsmaps;

import java.util.ArrayList;
import java.util.Collections;

public class KLaregestElements {

    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        Collections.sort(A, Collections.reverseOrder());
        return new ArrayList<>(A.subList(0, B));
    }
}
