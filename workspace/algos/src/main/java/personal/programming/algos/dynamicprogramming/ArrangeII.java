package personal.programming.algos.dynamicprogramming;

import java.util.Arrays;

public class ArrangeII {

    public int arrange(String A, int B) {
        if(B > A.length())
            return -1;
        int memory[] = new int[A.length()];
        int memoryCopy[] = new int[A.length()];

        int blackHorse[] = new int[A.length()];
        int whiteHorse[] = new int[A.length()];
        for(int i = 0; i < A.length(); i++){
            blackHorse[i] = A.charAt(i) == 'B' ? 1 : 0;
            if(i > 0) blackHorse[i] += blackHorse[i - 1];
            whiteHorse[i] = A.charAt(i) == 'W' ? 1 : 0;
            if(i > 0)   whiteHorse[i] += whiteHorse[i - 1];
            memory[i] = memoryCopy[i] = whiteHorse[i] * blackHorse[i];
        }
        for(int stable = 2; stable <= B; stable++ ){
            for(int j = 1; j < A.length(); j++){
                int min = Integer.MAX_VALUE;
                for(int k = stable - 2; k < j; k++){
                    min = Math.min(min, memoryCopy[k] + (whiteHorse[j] - whiteHorse[k])*(blackHorse[j]-blackHorse[k]));
                }
                memory[j] = min;
            }
            memoryCopy = Arrays.copyOf(memory, A.length());
        }
        return memory[A.length() - 1];
    }

}
