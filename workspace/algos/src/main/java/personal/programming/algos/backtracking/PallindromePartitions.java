package personal.programming.algos.backtracking;

import java.util.ArrayList;

public class PallindromePartitions {
    public ArrayList<ArrayList<String>> partition(String a) {
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        getPalindromePartitions(result,a,0,new ArrayList());
        return result;
    }
    public void getPalindromePartitions(ArrayList<ArrayList<String>> result,String a,int in,ArrayList temp){
        if(in>=a.length()){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=in;i<a.length();i++){
            String str = a.substring(in,i+1);
            if(checkPalindrome(str)){
                temp.add(str);
                getPalindromePartitions(result, a,i+1,temp);
                temp.remove(temp.size()-1);
            }
        }
    }
    public boolean checkPalindrome(String str){
        for(int i=0,j=str.length()-1;i<j;i++){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }
}
