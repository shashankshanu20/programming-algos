package personal.programming.algos.dynamicprogramming;

public class LongestPallindromicSubsequence {

    public static void main(String []args){
        LongestPallindromicSubsequence longestPallindromicSubsequence = new LongestPallindromicSubsequence();
        System.out.println(longestPallindromicSubsequence.solve( "bebeeed"));
    }

    public int solve(String A) {
        int [][]memory = new int[A.length()+1][A.length()+1];

        return pallindromicSubsequence(A,memory,0,A.length()-1);

    }

    public int pallindromicSubsequence(String a, int [][]memory, int firstIndex, int secondIndex){
        if(firstIndex>=a.length()||secondIndex<0){
            return 0;
        }
        if(memory[firstIndex][secondIndex]!=0){
            return memory[firstIndex][secondIndex];
        }
        if(a.charAt(firstIndex)==a.charAt(secondIndex)){
            memory[firstIndex][secondIndex] = 1+pallindromicSubsequence(a,memory,firstIndex+1, secondIndex-1);
            return memory[firstIndex][secondIndex];
        }else{
            memory[firstIndex][secondIndex] = Math.max(pallindromicSubsequence(a, memory, firstIndex+1, secondIndex),pallindromicSubsequence(a, memory, firstIndex, secondIndex-1));
            return memory[firstIndex][secondIndex];
        }

    }


}
