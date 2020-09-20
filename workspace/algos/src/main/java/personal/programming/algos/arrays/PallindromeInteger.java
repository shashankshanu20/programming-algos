package personal.programming.algos.arrays;

public class PallindromeInteger {

    public static void main(String []args){

        System.out.println(isPalindrome(-1234567891));
    }

    public static int isPalindrome(int A) {
        long reverse = 0;
        int i=Math.abs(A);
        while(i>0){
            reverse = reverse*10 + i%10;
            i /= 10;
        }
        return A<0?-reverse<Integer.MIN_VALUE?0:-(int)reverse:reverse>Integer.MAX_VALUE?0:(int)reverse;
    }

}
