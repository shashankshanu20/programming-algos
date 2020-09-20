package personal.programming.algos.arrays;

import java.util.ArrayList;

public class AntiDiagonals {
    public static void main(String []args){
        ArrayList<ArrayList<Integer>>  A = new ArrayList<>();
        ArrayList<Integer> row = new ArrayList<>();
        row.add(1);
        row.add(2);
        row.add(3);
        A.add(row);
        row = new ArrayList<>();
        row.add(4);
        row.add(5);
        row.add(6);
        A.add(row);
        row = new ArrayList<>();
        row.add(7);
        row.add(8);
        row.add(9);
        A.add(row);

        int [][]a = {{1,2,3},{4,5,6},{7,8,9}};
//        System.out.println(diagonal(A));
        diagonal(a);
    }


//    public static ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
//        int n = A.size();
//        int total = n + n;
//        total -= 1;
//        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
//
//        int row = 0;
//        int col = -1;
//        int count = 0;
//        int size = 0;
//        while (count < total) {
//            if (count >= n) {
//                row++;
//                col = n - 1;
//                size--;
//            } else {
//                col++;
//                size++;
//
//            }
//            ArrayList<Integer> diagonal = new ArrayList<>();
//            int i = row;
//            int j = col;
//            while (i < n && j >= 0) {
//                diagonal.add( A.get(i++).get(j--));
//            }
//            result.add(diagonal);
//            count++;
//
//        }
//        return result;
//    }
        public static ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
            int i = 0, j = 0, row = 0, col = 0, l = 0;
            ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

            if(A.size() - 1 < 0 || A.get(0).size() - 1 < 0) return result;

            for(int k = 0; k < (A.get(0).size() * 2 - 1); k++){
                result.add(new ArrayList<Integer>());
            }
            while(true){
                ArrayList<Integer> C = result.get(l);
                C.add(A.get(i).get(j));
                i++;
                j--;
                if(j < 0 && i < A.size()){
                    col++;
                    j = col;
                    i = row;
                    l++;
                }
                if(i > A.size() - 1){
                    row++;
                    j = col;
                    i = row;
                    l++;
                }
                if(l == result.size()){
                    break;
                }
            }

            return result;
        }



    public static void diagonal(int[][] A){

        int n=A.length;


        int ans[][]=new int[n+n-1][];

        int index=0;



        /////simple diagonal
        for(int x=0;x<n;x++){

            int size=0;

            /////////size getter

            int xx=x;

            for(int y=0;y<n && xx>=0;y++){

                size++;

                xx--;

            }

            ans[index]=new int[size];

            /////////put values now

            xx=x;

            for(int y=0;y<n && xx>=0;y++){

                ans[index][y]=A[y][xx];

                xx--;

            }

            index++;

        }



        ///////////complex diagonal

        for(int y=1;y<n;y++){

            int size=0;

            /////////size getter

            int yy=y;

            for( int x=n-1;x>=0 && yy<n;x--){

                size++;

                yy++;

            }

            ans[index]=new int[size];

            /////////put values now

            yy=y;

            int onlyhere=0;

            for(  int x=n-1;x>=0 && yy<n;x--){

                ans[index][onlyhere]=A[yy][x];

                yy++;

                onlyhere++;

            }

            index++;

        }

        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[i].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
//        return ans;

    }
}
