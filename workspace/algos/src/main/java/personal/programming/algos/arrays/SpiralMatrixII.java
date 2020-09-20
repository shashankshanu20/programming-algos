package personal.programming.algos.arrays;

import java.util.ArrayList;

public class SpiralMatrixII {
    public static void main(String []args){
        System.out.println(generateMatrix(3));
    }

    public static ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        ArrayList<ArrayList<Integer>> retArr = new ArrayList<>();

        for(int i = 0; i<A; i++){
            retArr.add(new ArrayList<>());
        }
        int jmax=A-1,imin=0, imax=A-1, jmin=0;
        int dir=0;
        int num = 1;
        while(jmin<=jmax&&imin<=imax){
            if(dir==0){
                int j=jmin;
                while(j<=jmax){
                    if(retArr.get(imin).size()<A){
                        while(retArr.get(imin).size()!=A){
                            retArr.get(imin).add(0);
                        }
                    }
                    retArr.get(imin).set(j, num);
                    num++;
                    j++;
                }
                imin++;
            }else if(dir==1){
                int j=imin;
                while(j<=imax){
                    if(retArr.get(j).size()<A){
                        while(retArr.get(j).size()!=A){
                            retArr.get(j).add(0);
                        }
                    }
                    retArr.get(j).set(jmax, num);
                    num++;
                    j++;
                }
                jmax--;
            }else if (dir==2){
                int j=jmax;
                while(j>=jmin){
                    if(retArr.get(imax).size()<A){
                        while(retArr.get(imax).size()!=A){
                            retArr.get(imax).add(0);
                        }
                    }
                    retArr.get(imax).set(j, num);
                    num++;
                    j--;
                }
                imax--;
            }else if (dir==3){
                int j=imax;
                while (j>=imin){
                    if(retArr.get(j).size()<A){
                        while(retArr.get(j).size()!=A){
                            retArr.get(j).add(0);
                        }
                    }
                    retArr.get(j).set(jmin, num);
                    num++;
                    j--;
                }
                jmin++;
            }
            dir = (dir+1)%4;

        }
        return retArr;

    }
}
