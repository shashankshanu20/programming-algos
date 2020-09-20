package personal.programming.algos.strings;

public class LengthOfLAstWord {
    public static void main(String []args){

    }

    public int lengthOfLastWord(final String A) {
        int length = 0;
        String copyStr = A.trim();
        if(copyStr.length()==0){
            return length;
        }
        for( int i = copyStr.length()-1 ; i >= 0 ; i-- )
        {
            char ch = copyStr.charAt(i) ;
            if( ch == ' ' )
            {
                return length ;

            }

            length++ ;

        }

        return length;


    }
}
