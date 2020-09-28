package personal.programming.algos.backtracking;

import java.util.ArrayList;

public class GrayCode {
    public ArrayList grayCode(int a) {
        ArrayList result=new ArrayList<>();
        for(int i = 0; i < (1<<a); i++)
            result.add(i^(i>>1));
        return result;
    }
}
