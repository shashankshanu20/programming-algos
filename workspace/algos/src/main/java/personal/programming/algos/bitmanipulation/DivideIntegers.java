package personal.programming.algos.bitmanipulation;

public class DivideIntegers {
    public static void main(String []args){

    }

    public int divide(int A, int B) {
        if(A==0 && B==0)
            return Integer.MAX_VALUE;

        if(A==0)
            return 0;

        long a=A;
        long b=B;

        int flaga=0,flagb=0;

        if(a<0)
        {
            flaga=1;
            a=a*(-1);
        }

        if(b<0)
        {
            flagb=1;
            b=b*(-1);
        }

        long res=a/b;

        if(flaga!=0 && flagb!=0)
        {
            //enjoy
        }
        else if(flaga!=0 || flagb!=0)
        {
            res=res*(-1);
        }

        if(res<Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        if(res>Integer.MAX_VALUE)
            return Integer.MAX_VALUE;

        return (int)res;
    }
}
