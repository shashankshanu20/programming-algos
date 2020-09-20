package personal.programming.algos.strings;

public class ValidNumber {
    public static void main(String []args){

    }

    public int isNumber(final String A) {
        String strs[]=A.split("e");
        if(strs.length>2)
            return 0;
        int i=0;
        if(strs[0].charAt(0)=='+'||strs[0].charAt(0)=='-')
            i++;
        if(strs[0].charAt(strs[0].length()-1)=='.')
            return 0;
        try
        {
            double d = Double.parseDouble(strs[0]);
        }catch(Exception e)
        {
            return 0;
        }
        if(strs.length==2){
            try
            {
                long d = Long.parseLong(strs[1]);
            }catch(Exception e)
            {
                return 0;
            }
        }

        return 1;
    }
}
