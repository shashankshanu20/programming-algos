package personal.programming.algos.arrays;

public class LargestCoprimeDivisor {
    public static void main(String []args){

    }
    public int cpFact(int A, int B) {

        int x = A;
        while(x>1){
            if(A%x==0){
                if(gcd(B,x)==1){
                    return x;
                }
            }
            x--;
        }
        return x;

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
