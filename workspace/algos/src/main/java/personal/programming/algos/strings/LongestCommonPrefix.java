package personal.programming.algos.strings;

import java.util.ArrayList;

public class LongestCommonPrefix {

    public static void main(String []args){

    }

    public String longestCommonPrefix(ArrayList<String> A) {
        String prefix = A.get(0);
        for(int i = 1;i<A.size();i++){
            if(prefix.equals(A.get(i))){
                continue;
            }else {
                String str= "";
                int  j= 0;
                int size = prefix.length()>A.get(i).length()?A.get(i).length():prefix.length();
                while(j<size){
                    if(prefix.charAt(j)!=A.get(i).charAt(j)){
                        break;
                    }
                    str+=prefix.charAt(j);
                    j++;
                }
                prefix = str;
            }
        }
        return prefix;
    }

}
