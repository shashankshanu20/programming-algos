package personal.programming.algos.stacksqueues;

import java.util.Stack;

public class MinStk {
}

class Solution {
    Stack<Integer> intStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int x) {
        intStack.push(x);
        if(minStack.isEmpty()||minStack.peek()>=x){
            minStack.push(x);
        }
    }

    public void pop() {
        if(!intStack.isEmpty()){
            int poppedElement = intStack.pop();
            if(poppedElement==minStack.peek()){
                minStack.pop();
            }
        }
    }

    public int top() {
        return intStack.isEmpty()?-1:intStack.peek();
    }

    public int getMin() {
        return minStack.isEmpty()?-1:minStack.peek();
    }
}