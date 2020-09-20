package personal.programming.algos.arrays;

public class GreatestCommonDivisor {
    public static void main(String []args){
        System.out.println(gcd(6,12));
    }

    public static int gcd(int A, int B) {
        int max = A>B?A:B;
        int min = A>B?B:A;
        int i = min;
        while(i>1){
            if(max%i==0&&min%i==0){
                return i;
            }
            i--;
        }
        return 1;
    }

}
