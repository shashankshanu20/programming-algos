package personal.programming.algos.dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsetSumProblem {

    public static void main(String []args){
        SubsetSumProblem subsetSumProblem = new SubsetSumProblem();
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(3, 34, 4, 12, 5, 2));
        int result = subsetSumProblem.solve(A,30);
        System.out.println(result);
    }
    public int solve(ArrayList<Integer> A, int B) {
        int [][]memory = new int[A.size()+1][B+1];
        for(int  i= 0; i<A.size()+1;i++){
            Arrays.fill(memory[i],-1);
        }
        return traverse(A,A.size()-1,B,memory)?1:0;
    }

//    public int traverse(ArrayList<Integer> A, int index, int B, int [][]memory){
//        if(index==0||B==0){
//            return 0;
//        }
//        if(memory[index][B]!=-1){
//            return memory[index][B];
//        }
//
//        if(A.get(index)==B){
//            memory[index][B] = 1;
//            return 1;
//        }
//        if(A.get(index)<B){
//            memory[index][B] = Math.max(traverse(A, index-1,B, memory),traverse(A, index-1,B-A.get(index), memory));
//            return memory[index][B];
//        }else{
//            memory[index][B] = traverse(A, index-1,B, memory);
//            return memory[index][B];
//        }
//
//    }


    boolean traverse(ArrayList<Integer> A, int index, int B, int [][]memory)
    {
        if(B==0)
            return true;
        if(index==0&&B!=0)
            return false;
        if(memory[index][B]!=-1)
            return  memory[index][B]==1?Boolean.TRUE:Boolean.FALSE;
        if(A.get(index-1)<=B){
            memory[index][B]=(traverse(A,index-1,B,memory)||traverse(A,index-1,B-A.get(index-1),memory))?1:0;
        }else{
            memory[index][B]=traverse(A,index-1,B,memory)?1:0;
        }
        return memory[index][B]==1?Boolean.TRUE:Boolean.FALSE;
    }


}
