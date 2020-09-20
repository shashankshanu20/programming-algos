package personal.programming.algos.bitmanipulation;

public class ReverseBits {
    public static void main(String []args){
        System.out.println(reverse(2));
    }


    public static long reverse(long a) {
        long sum = 0;
        int i = 31;
        while(a != 0)
        {
            sum += Math.abs((a & 1) * (1 << i));
            System.out.println("sum : "+sum);
            System.out.println("a : "+a+", i : "+i);
            a = a >> 1;
            i--;
        }
        return sum;
    }
}
