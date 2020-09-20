package personal.programming.algos.strings;

public class MinAppendsPallindrome {
    public static void main(String []args){
        System.out.println(solve(""));
    }
    public static int solve(String A) {
        int  i= 0;
        for(;i<A.length();i++){
            if(isPalindrome(A.substring(i))==1){
                break;
            }
        }
        return i;
    }
    public static int isPalindrome(String A) {
        A = A.replaceAll("[^a-zA-Z0-9]","");
        StringBuilder stringBuilder = new StringBuilder(A);
        if(A.equalsIgnoreCase(stringBuilder.reverse().toString())){
            return 1;
        }else{
            return 0;
        }
    }
}
