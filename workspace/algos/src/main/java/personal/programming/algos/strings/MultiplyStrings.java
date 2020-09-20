package personal.programming.algos.strings;

public class MultiplyStrings {
    public static void main(String []args){

    }

    public String multiply(String A, String B) {

        A = A.trim();
        B = B.trim();

//        char[] arrA = A.toCharArray();
//        char[] arrB = B.toCharArray();
        int[] product = new int[A.length() + B.length()];

        for(int i=A.length()-1;i>=0;i--){
            for(int j=B.length()-1;j>=0;j--){
                product[i+j+1] += Character.getNumericValue(A.charAt(i)) *
                        Character.getNumericValue(B.charAt(j));

                product[i+j] += product[i+j+1] / 10;
                product[i+j+1] %= 10;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();

        for(int num : product){
            stringBuilder.append(num);
        }

        String result = stringBuilder.toString().replaceFirst("^0*", "");

        return result.isEmpty() ? "0" : result;
    }
}
