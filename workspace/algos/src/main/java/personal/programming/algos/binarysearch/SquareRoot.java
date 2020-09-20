package personal.programming.algos.binarysearch;

public class SquareRoot {
    public static void main(String []args){
        System.out.println(sqrt(9));
    }
    public static int sqrt(int A) {
        if (A == 0) {
            return 0;
        }
        int start = 1, end = A, ans=0;
        while (start <= end) {
            int mid = start +(end - start) / 2;
            if (mid <= A / mid) {
                start = mid + 1;
                ans = mid;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

}
