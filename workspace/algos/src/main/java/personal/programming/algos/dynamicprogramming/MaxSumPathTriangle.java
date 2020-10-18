package personal.programming.algos.dynamicprogramming;

import java.util.ArrayList;

public class MaxSumPathTriangle {

    public static void main(String []args){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3);a.add(0);a.add(0);a.add(0);
        result.add(a);
        a = new ArrayList<>();
        a.add(7);a.add(4);a.add(0);a.add(0);
        result.add(a);
        a = new ArrayList<>();
        a.add(2);a.add(4);a.add(6);a.add(0);
        result.add(a);
        a = new ArrayList<>();
        a.add(8);a.add(5);a.add(9);a.add(3);
        result.add(a);
        MaxSumPathTriangle maxSumPathTriangle = new MaxSumPathTriangle();
        System.out.println(maxSumPathTriangle.solve(result));
    }

    public int solve(ArrayList<ArrayList<Integer>> A) {
        int [][]memory = new int[A.size()][A.size()];
        return traverse(A,0,0, memory);
    }

    public int traverse(ArrayList<ArrayList<Integer>> a, int row, int column, int [][]memory){
        if(row==a.size()-1){
            memory[row][column] = a.get(row).get(column);
            return  memory[row][column];
        }
        if(a.get(row).get(column)==0){
            return 0;
        }
        if( memory[row][column]!=0){
            return  memory[row][column];
        }
        memory[row][column] = a.get(row).get(column)+ Math.max(traverse(a,row+1,column, memory),traverse(a,row+1,column+1, memory));
        return memory[row][column] ;
    }

}
