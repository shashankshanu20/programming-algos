package personal.programming.algos.strings;

import java.math.BigInteger;

public class CompareVersions {
    public static void main(String []args){
        System.out.println(compareVersion("1","1.0"));
    }

    public static int compareVersion(String A, String B) {

        String[] splitA = A.split("\\.");
        String []splitB = B.split("\\.");
        int i = 0, j = 0;
        while(i < splitA.length || j < splitB.length){
            if(i== splitA.length){
                if(new BigInteger(splitB[j]).compareTo(BigInteger.ZERO)>0){
                    return -1;
                }else{
                    j++;
                    continue;
                }
            }else if(j== splitB.length){
                if(new BigInteger(splitA[i]).compareTo(BigInteger.ZERO)>0){
                    return 1;
                }else{
                   i++;
                   continue;
                }
            }

            int value  = new BigInteger(splitA[i]).compareTo(new BigInteger(splitB[j]));
            if(value!=0){
                return value;
            }

            if(i<splitA.length){
                i++;
            }
            if(j<splitB.length){
                j++;
            }
        }

        return 0;
    }

}
