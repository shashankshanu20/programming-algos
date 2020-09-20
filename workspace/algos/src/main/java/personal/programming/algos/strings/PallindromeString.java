package personal.programming.algos.strings;

public class PallindromeString {
    public static void main(String []args){
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
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
