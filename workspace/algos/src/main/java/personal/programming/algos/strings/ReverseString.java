package personal.programming.algos.strings;

public class ReverseString {
    public static void main(String []args){

    }

    public String solve(String A) {
        A = A.trim();
        if(A.isEmpty()){
            return "";
        }

        //replacing one or more consecutive spaces;
        String []arr = A.split("\\s{1,}");
        A = "";
        for(int i = arr.length-1; i>=0;i--){
            A = arr[i]+" ";
        }
        return A.trim();
    }

}
