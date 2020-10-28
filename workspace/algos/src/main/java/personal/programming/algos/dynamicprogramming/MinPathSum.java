package personal.programming.algos.dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;

public class MinPathSum {

    public static void main(String []args){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);a.add(3);a.add(2);
        result.add(a);
        a = new ArrayList<>();
        a.add(4);a.add(3);a.add(1);
        result.add(a);
        a = new ArrayList<>();
        a.add(5);a.add(6);a.add(1);
        result.add(a);
        MinPathSum minPathSum = new MinPathSum();
        System.out.println(minPathSum.minPathSum(result));
    }

    public int minPathSum(ArrayList<ArrayList<Integer>> A) {
        int [][]memory = new int[A.size()][A.get(0).size()];
        for(int i = 0; i<A.size(); i++){
            Arrays.fill(memory[i],-1);
        }
        return traverse(A,0,0,memory);
    }

    public int traverse(ArrayList<ArrayList<Integer>> A, int row, int column, int [][]memory){
        if(row==A.size()-1&&column==A.get(0).size()-1){
            memory[row][column] = A.get(row).get(column);
            return memory[row][column];
        }
        if(memory[row][column]!=-1){
            return memory[row][column];
        }
        if(row==A.size()-1&&column<A.get(0).size()-1){
            memory[row][column] = A.get(row).get(column)+traverse(A,row,column+1,memory);
        }else if(row<A.size()-1&&column==A.get(0).size()-1){
            memory[row][column] = A.get(row).get(column)+traverse(A,row+1,column,memory);
        }else {
            memory[row][column] = A.get(row).get(column)+Math.min(traverse(A,row+1,column,memory),traverse(A,row,column+1,memory));
        }
        return memory[row][column];
    }
}
