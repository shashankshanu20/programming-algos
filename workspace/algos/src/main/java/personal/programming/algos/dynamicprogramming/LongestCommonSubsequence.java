package personal.programming.algos.dynamicprogramming;

public class LongestCommonSubsequence {
    public int solve(String A, String B) {
        int [][]memory = new int[A.length()+1][B.length()+1];

        return subsequentLength(A,B,A.length()-1,B.length()-1,memory);
    }
    public int subsequentLength(String a, String b, int aindex, int bindex, int [][]memory){
        if(aindex<0||bindex<0){
            return 0;
        }
        if(memory[aindex][bindex]!=0){
            return memory[aindex][bindex];
        }
        if(a.charAt(aindex)==b.charAt(bindex)){
            memory[aindex][bindex] = 1 + subsequentLength(a, b, aindex-1, bindex-1, memory);
            return memory[aindex][bindex];
        }
        memory[aindex][bindex] = Math.max(subsequentLength(a, b, aindex-1, bindex, memory),subsequentLength(a, b, aindex, bindex-1, memory));
        return memory[aindex][bindex];
    }


}
