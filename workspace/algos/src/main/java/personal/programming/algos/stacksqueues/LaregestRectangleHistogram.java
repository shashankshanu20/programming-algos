package personal.programming.algos.stacksqueues;

import java.util.ArrayList;
import java.util.Stack;

public class LaregestRectangleHistogram {

    public int largestRectangleArea(ArrayList<Integer> A) {
        if(null == A || A.isEmpty()){
            return 0;
        }
        if(A.size() == 1){
            return A.get(0);
        }
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        while(i<A.size()){
            if(stack.isEmpty() || A.get(stack.peek()) <= A.get(i)){
                stack.push(i);
                i++;
            }else{
                int top = stack.pop();
                int height = A.get(top);
                int width = stack.isEmpty()? i : (i - stack.peek() - 1);
                maxArea = Math.max(maxArea, height * width);
            }
        }
        while(!stack.isEmpty()){
            int top = stack.pop();
            int height = A.get(top);
            int width = stack.isEmpty()? i : (i - stack.peek() - 1);
            maxArea = Math.max(maxArea, height * width);
        }
        return maxArea;
    }
}
