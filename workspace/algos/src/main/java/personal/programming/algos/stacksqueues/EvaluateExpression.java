package personal.programming.algos.stacksqueues;

import java.util.ArrayList;
import java.util.Stack;

public class EvaluateExpression {

    public static void main(String []args){

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("2");
        arrayList.add("1");
        arrayList.add("+");
        arrayList.add("3");
        arrayList.add("*");

        System.out.println(evalRPN(arrayList));
    }


    public static int evalRPN(ArrayList<String> A) {
        Stack<Integer> stack=new Stack<Integer>();

        for(int i=0;i<A.size();i++)
        {
            String exp=A.get(i);
            if(exp.equals("*"))
            {
                int a=stack.pop();
                int b=stack.pop();
                stack.push(a*b);
            }
            else if(exp.equals("+"))
            {
                int a=stack.pop();
                int b=stack.pop();
                stack.push(a+b);
            }
            else if(exp.equals("/"))
            {
                int a=stack.pop();
                int b=stack.pop();
                stack.push(b/a);
            }
            else if(exp.equals("-"))
            {
                int a=stack.pop();
                int b=stack.pop();
                stack.push(b-a);
            }
            else
            {
                stack.push(Integer.parseInt(exp));
            }
        }
        return stack.peek();
    }
}
