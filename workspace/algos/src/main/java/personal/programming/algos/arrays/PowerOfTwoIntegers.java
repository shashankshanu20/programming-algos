package personal.programming.algos.arrays;

public class PowerOfTwoIntegers {
    public static void main(String []args){

    }

    public int isPower(int A) {
        if(A==1){
            return 1;
        }
        for(int i = 2;i<=Math.sqrt(A);i++){
            double val = Math.log(A)/Math.log(i);
            if(Math.floor(val)==Math.ceil(val)){
                return 1;
            }
        }
        return 0;
    }

}
