package personal.programming.algos.arrays;

public class GridUniquePaths {
    public static void main(String []args){

    }
    public int uniquePaths(int A, int B) {
        int [][]arr = new int[A][B];
        for(int i = 0;i < A;i++){
            arr[i][0] = 1;
        }
        for(int i = 0;i < B;i++){
            arr[0][i] = 1;
        }

        for(int i = 1;i<A;i++){
            for(int j = 1; j < B;j++){
                arr[i][j] = arr[i-1][j] + arr[i][j-1];
            }
        }
        return arr[A-1][B-1];
    }
}
