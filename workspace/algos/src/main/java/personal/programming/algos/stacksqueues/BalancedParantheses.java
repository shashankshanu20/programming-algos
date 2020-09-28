package personal.programming.algos.stacksqueues;

import java.util.Stack;

public class BalancedParantheses {

    public static int solve(String A) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<A.length(); i++){
            char str = A.charAt(i);
            if(str=='('){
                stack.push(str);
            }else{
                if(stack.isEmpty()){
                    return 0;
                }
                stack.pop();
            }
        }
        return stack.isEmpty()?1:0;
    }
}
