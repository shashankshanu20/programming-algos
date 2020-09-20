package personal.programming.algos.strings;

public class MinCharactersStringPallindromic {
    public static void main(String []args){
        String abc = "sjkdf    slfnlofew woefn";
    String[] arr = abc.split("\\s{1,}");
        System.out.println(arr.length);
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println(arr.toString());
    }

    public int solve(String A) {
        int count = 0;
        int i = 0, j = A.length()-1;
        while(i<j) {
            if (A.charAt(i) == A.charAt(j)) {
                i++;
                j--;
            } else {
                if (i == 0){
                    count += 1;
                    j--;
                } else {
                    count += i;
                    i = 0;
                }
            }
        }
        return count;
    }
}
