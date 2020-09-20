package personal.programming.algos.arrays;

public class ExcelColumnTitle {

    public static void main(String []args){
        System.out.println(convertToTitle(943566));
    }

    public static String convertToTitle(int A) {
        StringBuilder result = new StringBuilder();
        while(A>0){
            result.append(Character.toString((char)((A%26==0?26:A%26)+64)));
            A = A%26==0?A/26-1:A/26;
        }
        return result.reverse().toString();
    }
}
