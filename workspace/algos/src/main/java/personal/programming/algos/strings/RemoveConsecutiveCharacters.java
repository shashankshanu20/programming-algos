package personal.programming.algos.strings;

public class RemoveConsecutiveCharacters {
    public static void main(String []args){
        System.out.println(solve("abc",2));
    }

    public static String solve(String A, int B) {
        String result = "";
        String buffer = "";
        buffer += A.charAt(0);
        char previousChar = A.charAt(0);

        for (int i=1; i<A.length(); i++) {
            if (previousChar == A.charAt(i)) {
                buffer += A.charAt(i);
            }else {
                if (buffer.length() != B) {
                    result += buffer;
                }
                buffer = ""+A.charAt(i);
                previousChar = A.charAt(i);
            }
        }

        if (buffer.length() != B) {
            result += buffer;
        }

        return result;
    }

}
