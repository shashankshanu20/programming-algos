package personal.programming.algos.backtracking;

public class MaximalString {

    public String solve(String A, int B) {
        StringBuilder result = new StringBuilder(A);
        maxString(A, B, result);
        return result.toString();
    }

    public void maxString(String A, int B, StringBuilder maxNum){
        if (B > 0) {
          for (int i = 0; i < A.length() - 1; i++) {
            for (int j = i + 1; j < A.length(); j++) {
              if (A.charAt(j) > A.charAt(i)) {
                  StringBuilder sb = new StringBuilder(A);
                  sb.setCharAt(i, A.charAt(j));
                  sb.setCharAt(j, A.charAt(i));
                  A = sb.toString();
                  if (Integer.parseInt(A) > Integer.parseInt(maxNum.toString()))
                    maxNum = new StringBuilder(A);
                maxString(A, B - 1, maxNum);
                  StringBuilder sb2 = new StringBuilder(A);
                  sb2.setCharAt(i, A.charAt(j));
                  sb2.setCharAt(j, A.charAt(i));
                  A = sb2.toString();
              }
            }
          }
        }
    }


}
