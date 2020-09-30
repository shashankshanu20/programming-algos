package personal.programming.algos.hashing;

import java.util.HashSet;
import java.util.Set;

public class Colorful {

    public static void main(String []args){
        System.out.println(colorful(23 ));
    }

    public static int colorful(int A) {

        Set<Integer> numSet = new HashSet<>();
        while (A > 0) {
            int product = A % 10;
            int temp = A;
            while (temp > 0) {
                if (!numSet.add(product))
                    return 0;
                temp = temp / 10;
                product *= temp % 10;
            }
            A = A/10;
        }

        return 1;
    }


}
