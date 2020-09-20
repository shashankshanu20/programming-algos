package personal.programming.algos.arrays;

public class TrailingZeroes {
    public static void main(String []args){
        System.out.println(trailingZeroes(29));
    }

    public static int trailingZeroes(int A) {
        int count = 0;
        while(A>4){
            count += Math.floor(A/5);
            A/=5;
        }
        return count;
    }

}
