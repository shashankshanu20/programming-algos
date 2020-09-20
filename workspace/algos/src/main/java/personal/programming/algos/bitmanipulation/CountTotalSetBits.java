package personal.programming.algos.bitmanipulation;

public class CountTotalSetBits {
    public static void main(String []args){
        System.out.println(solve(4));
    }

    public static int solve(int A) {
        int count = 0;
        for(int i = A;i>0;i--){
            int bit = 0;
            while(i>>bit!=0){
                count = (count + ((i>>bit)&1))% 1000000007;
                bit++;
            }
        }
        return count;
    }
}
