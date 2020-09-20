package personal.programming.algos.strings;

public class ImplementStrStr {
    public static void main(String []args){

        System.out.println(strStr("bbaabbbbbaabbaabbbbbbabbbabaabbbabbabbbbababbbabbabaaababbbaabaaaba","babaaa"));
    }

    public static int strStr(final String A, final String B) {
        int index = -1;
        String minStr = "";
        String maxStr = "";
        if(A.length()<B.length()){
           return -1;
        }else {
            minStr = B;
            maxStr = A;
        }

        if(A.isEmpty()||B.isEmpty()){
            return index;
        }
        int i = 0, j =0;
        for(;i<maxStr.length()&&j<minStr.length();i++){
            if(maxStr.charAt(i)==minStr.charAt(j)){
                index = index==-1?i:index;
                j++;
            }else{
                    index = i;
                    j=1;
            }
        }
        return j==minStr.length()?index:-1;
    }
}
