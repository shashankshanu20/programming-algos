package personal.programming.algos.strings;

public class CountAndSay {
    public static void main(String []args){
        System.out.println(countAndSay(5));
    }
    public static String countAndSay(int A) {
        String result="";
        if(A == 1){
            return "11";
        }
        String n = "1";
        while(A>1){
            String str = n;
            int count = 0;
            char prev=str.charAt(0);
            for(int i = 0 ;i<=str.length();i++){

                if(i == str.length()){
                    result = result + count+prev;
                    break;
                }
                if(str.charAt(i)==prev){
                    count++;
                }else{
                    result = result + count+prev;
                    prev = str.charAt(i);
                    count = 1;
                }
            }
            n = result;
            result = "";
            A--;
        }

        return n;
    }

}
