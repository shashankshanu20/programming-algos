package personal.programming.algos.strings;

public class LongestPallindrome {
    public static void main(String []args){

    }

    public String longestPalindrome(String A) {
        int maxLength  = 0;
        int i = 0,j=A.length();
        for(i = 0;i<A.length();i++){
            for(j= A.length() ;j>i;j--){
                if(isPalindrome(A.substring(i,j))==1){
                    maxLength  = Math.max(maxLength, j-i);
                }
            }
        }
        return A.substring(i,j);
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
