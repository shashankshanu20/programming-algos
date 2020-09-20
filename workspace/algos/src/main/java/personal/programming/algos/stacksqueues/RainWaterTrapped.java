package personal.programming.algos.stacksqueues;

import java.util.List;
import java.util.Stack;

public class RainWaterTrapped {


    public int trap(final List<Integer> A) {
        int n=A.size();
        int left[]=new int[n];
        int right[]=new int[n];

        //#leftmax
        int leftMax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            leftMax = Math.max(leftMax, A.get(i));
            left[i]=leftMax;
        }

        //#rightmax
        int rightMax=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--) {
            rightMax = Math.max(rightMax, A.get(i));
            right[i]=rightMax;
        }

        //Main Logic here
        int res=0;
        for(int i=0;i<n;i++) {
            res += Math.min(left[i], right[i])-A.get(i);
        }

        return res;
    }


    public int trapped(final List<Integer> A) {
        Stack<Integer> stack = new Stack<>();
        int water=0,distance,height;
        for(int i=0;i<A.size();i++)
        {
            while(!stack.empty() && A.get(stack.peek())<A.get(i))
            {
                int top=stack.peek();
                stack.pop();
                if(!stack.empty())
                {
                    distance=i-stack.peek()-1;
                    height=Math.min(A.get(i),A.get(stack.peek()))-A.get(top);
                    water+=distance*height;
                }
            }
            stack.push(i);
        }
        return water;
    }
}
