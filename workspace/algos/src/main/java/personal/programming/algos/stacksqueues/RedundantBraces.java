package personal.programming.algos.stacksqueues;

import java.util.Stack;

public class RedundantBraces {



    public int braces(String A){
        Stack<Character> characterStack = new Stack<>();
        for(int i=0;i<A.length();i++){
            char ch = A.charAt(i);
            if(ch=='(' || ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                characterStack.push(ch);
            }else if(ch==')'){
                if(characterStack.peek()=='('){
                    return 1;
                }else{
                    while(characterStack.peek()!='('){
                        characterStack.pop();
                    }
                    characterStack.pop();
                }
            }
        }
        return 0;
    }
}
