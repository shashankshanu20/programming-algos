package personal.programming.algos.dynamicprogramming;

import java.util.Arrays;

public class EditDistance {
    public static void main(String []args){
        EditDistance editDistance = new EditDistance();
        System.out.println(editDistance.minDistance("b","a"));

    }
    public int minDistance(String A, String B) {
        int [][]memory = new int[A.length()+1][B.length()+1];
        for(int i = 0;i<=A.length();i++){
            Arrays.fill(memory[i], -1);
        }

        return calcMinDistance(A, B, A.length()-1,B.length()-1,memory);
    }

    public int calcMinDistance(String a, String b, int aindex, int bindex, int [][]memory){
        if(aindex<0){
            return bindex+1;
        }
        if(bindex==0){
            return aindex+1;
        }
        if(memory[aindex][bindex] != -1)
            return memory[aindex][bindex];

        if(a.charAt(aindex)==b.charAt(bindex)){
            memory[aindex][bindex] = calcMinDistance(a,b,aindex-1,bindex-1,memory);
        }else{
            memory[aindex][bindex] = 1+Math.min(calcMinDistance(a,b,aindex-1,bindex-1,memory),Math.min(calcMinDistance(a,b,aindex-1,bindex,memory),calcMinDistance(a,b,aindex,bindex-1,memory)));
        }
        return memory[aindex][bindex];
    }
}
