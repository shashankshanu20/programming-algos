package personal.programming.algos.binarysearch;

public class ImplementPowerFunction {
    public static void main(String []args){

    }

    public int pow(int x, int n, int d) {
        long ans;
        if(x==0) return 0;
        if(n==0) return 1;
        if(x<0)  return pow(d+x,n,d);

        long temp = pow(x,n/2,d);
        if(n%2==0)
            ans = ((temp%d)*(temp%d))%d;
        else
            ans = ((((x%d)*(temp%d))%d)*(temp%d))%d;

        return (int)ans%d;
    }
}
