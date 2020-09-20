package personal.programming.algos.strings;

import java.util.ArrayList;
import java.util.Arrays;

public class JustifiedText {
    public static void main(String []args){
//        ArrayList<String> A = new ArrayList<>(Arrays.asList("This", "is", "an", "example", "of", "text", "justification."));
//        System.out.println(fullJustify(A, 16));
//        ArrayList<String> A = new ArrayList<>(Arrays.asList("What", "must", "be", "shall", "be."));
//        System.out.println(fullJustify(A, 12));
         ArrayList<String> A = new ArrayList<>(Arrays.asList("glu", "muskzjyen", "ahxkp", "t", "djmgzzyh", "jzudvh", "raji", "vmipiz", "sg", "rv", "mekoexzfmq", "fsrihvdnt", "yvnppem", "gidia", "fxjlzekp", "uvdaj", "ua", "pzagn", "bjffryz", "nkdd", "osrownxj", "fvluvpdj", "kkrpr", "khp", "eef", "aogrl", "gqfwfnaen", "qhujt", "vabjsmj", "ji", "f", "opihimudj", "awi", "jyjlyfavbg", "tqxupaaknt", "dvqxay", "ny", "ezxsvmqk", "ncsckq", "nzlce", "cxzdirg", "dnmaxql", "bhrgyuyc", "qtqt", "yka", "wkjriv", "xyfoxfcqzb", "fttsfs", "m"));
        System.out.println(fullJustify(A, 144));
    }

    public static ArrayList<String> fullJustify(ArrayList<String> A, int B) {
        ArrayList<String> result = new ArrayList<>();
        int lineLengthLeft = B;
        String s = "";
        for(int i = 0;i<A.size(); i++){
           if(A.get(i).length()<=lineLengthLeft){
                s = s.isEmpty()?A.get(i):s+" "+A.get(i);
                lineLengthLeft = lineLengthLeft - (A.get(i).length()+1);
            }else{
                    if(lineLengthLeft>0){
                        s  = lineJustification(s,B-s.length());
                    }
                    lineLengthLeft = B;
                    result.add(s);
                    s = A.get(i);
            }
            if(i==A.size()-1){
                lineLengthLeft = B-s.length();
                if(lineLengthLeft>0){
                    while (lineLengthLeft!=0){
                        s+= " ";
                        lineLengthLeft--;
                    }
                }
                result.add(s);
            }
        }
        return result;
    }


    public static String lineJustification(String str, int spacesLeft){
        String []arr = str.split(" ");
        int j = 0;
        if(arr.length<=2){
            while (spacesLeft!=0){
                arr[0] = arr[0]+" ";
                spacesLeft--;
            }

            return arr.length==1?arr[0]:arr[0]+arr[1];
        }else{
            while(spacesLeft!=0){
                if(j == arr.length-1){
                    j = 0;
                }
                arr[j]  = arr[j]+" ";
                j++;
                spacesLeft--;
            }
            String result = "";
            for(String st:arr){
                result += st+" ";
            }
            return result;
        }
    }
}
