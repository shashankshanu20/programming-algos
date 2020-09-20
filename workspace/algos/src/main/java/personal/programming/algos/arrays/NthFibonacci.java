package personal.programming.algos.arrays;

public class NthFibonacci {

    public static void main(String []args){
        System.out.println(solve(11));
    }
//836311896
//134903163
    public static int solve(int A) {
        long last = 1; long lasttolast = 1;
        if(A==1||A==2){
            return 1;
        }
        for(int i = 3; i<=A;i++){
            long temp = last;
            last = last%1000000007 + lasttolast%1000000007;
            lasttolast = temp;
        }
        return (int)last%1000000007;
    }

}
