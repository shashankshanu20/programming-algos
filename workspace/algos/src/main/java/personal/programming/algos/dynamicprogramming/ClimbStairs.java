package personal.programming.algos.dynamicprogramming;

public class ClimbStairs {
    public int climbStairs(int A) {
        int []memory = new int[A+1];
        return step(A, memory);
    }
    public int step(int A, int []memory){
        if(A==1){
            memory[A] = 1;
            return memory[A];
        }
        if(A==2){
            memory[A] = 2;
            return memory[A];
        }
        if(memory[A]!=0){
            return memory[A];
        }
        return step(A-1, memory)+step(A-2,memory);
    }
}
