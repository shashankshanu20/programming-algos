package personal.programming.algos.strings;

import java.util.ArrayList;

public class ValidIpAddresses {
    public static void main(String []args){

    }


    public ArrayList<String> restoreIpAddresses(String A)  {
        String tempA = A;
        int n = A.length();
        ArrayList<String>  res = new ArrayList<>();
        for (int i = 1; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    tempA = addChar(tempA, '.', i);
                    tempA = addChar(tempA, '.', j+1);
                    tempA = addChar(tempA, '.', k+2);
                    if (isValid(tempA)) {
                        res.add(tempA);
                    }
                    tempA = A;
                }
            }
        }
        return(res);
    }


    private static boolean isValid(String a) {
        if (a.charAt(0) == '.') {
            return false;
        }
        String[] aSplit = a.split("\\.");
        for (int i = 0; i < aSplit.length; i++) {
            String currString = aSplit[i];
            if (currString.length() == 0) {
                return false;
            }
            if (currString.length() <= 3 && Integer.valueOf(currString) <= 255) {
                // System.out.println(a);
                if (currString.charAt(0) == '0' && currString.length() != 1) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
    private static String addChar(String str, char ch, int position) {
        StringBuilder sb = new StringBuilder(str);
        sb.insert(position, ch);
        return sb.toString();
    }
}
