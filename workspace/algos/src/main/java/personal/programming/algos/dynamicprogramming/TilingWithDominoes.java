package personal.programming.algos.dynamicprogramming;

public class TilingWithDominoes {

    public int solve(int A) {
        if(A%2==1)
            return 0;
        if(A==2)
            return 3;

        int []memory = new int[A+1];
        long p;
        memory[1]=1;
        memory[2]=3;

        for(int i=3;i<=A;i++){
            if(i%2==1)
                p=(long)memory[i-1]+(long)memory[i-2];
            else
                p=(long)memory[i-2]+2*(long)memory[i-1];

            memory[i]=(int)p%1000000007;
        }
        return memory[A];
    }

}
