package personal.programming.algos.bitmanipulation;

public class CountTrailingZeroes {
    public static void main(String []args){
        System.out.println(solve(18));
    }

    public static int solve(int A) {
        int count = 0;
        while(A!=0){
            if((A&1)==1){
                break;
            }else{
                count++;
                A = A>>1;
            }
        }
        return count;
    }
}
