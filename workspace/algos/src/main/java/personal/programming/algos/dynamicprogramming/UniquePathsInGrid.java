package personal.programming.algos.dynamicprogramming;

import java.util.ArrayList;

public class UniquePathsInGrid {

    public static void main(String []args){
        UniquePathsInGrid uniquePathsInGrid = new UniquePathsInGrid();
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<Integer> bb=  new ArrayList<>();
        bb.add(0);
        A.add(bb);
        System.out.println(uniquePathsInGrid.uniquePathsWithObstacles(A));
    }

    public int uniquePathsWithObstacles(ArrayList<ArrayList<Integer>> A) {
        if(A==null||A.size()<=0||A.get(0)==null||A.get(0).size()<=0){
            return 0;
        }
        return traverse(A,0, A.size(),0, A.get(0).size());
    }

    public int traverse(ArrayList<ArrayList<Integer>> A, int rowindex, int totalRowSize, int columnindex, int totalColumnSize){
        if(rowindex >= totalRowSize || columnindex >= totalColumnSize){
            return 0;
        }
        if(A.get(rowindex).get(columnindex).intValue() == 1){
            return 0;
        }
        if(rowindex == totalRowSize-1 && columnindex == totalColumnSize-1){
            return 1;
        }
        return traverse(A, rowindex+1, totalRowSize, columnindex, totalColumnSize) + traverse(A, rowindex, totalRowSize, columnindex+1, totalColumnSize);
    }
}
