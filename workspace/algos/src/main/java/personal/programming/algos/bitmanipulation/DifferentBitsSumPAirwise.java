package personal.programming.algos.bitmanipulation;

import java.util.ArrayList;

public class DifferentBitsSumPAirwise {

    public static void main(String []args){

    }

    public int cntBits(ArrayList<Integer> A) {
        long res = 0;
        long mod = 1000000007L;
        for(int i = 0; i < 32; i++) {
            int mask = 1 << i;
            long ones = 0;
            long zeros = 0;
            for(int num : A) {
                if((mask & num) != 0) {
                    ones++;
                }
                else {
                    zeros++;
                }
            }
            res += (ones*zeros*2L % mod);
        }

        return (int)(res%mod);
    }
}
