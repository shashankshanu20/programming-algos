package personal.programming.algos.stacksqueues;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MaxIndexProduct {

    public int maxSpecialProduct(ArrayList<Integer> A) {

        List<Integer> leftSpecialArr = new ArrayList<>();
        List<Integer> rightSpecialArr = new ArrayList<>();
        for(Integer num : A){
            leftSpecialArr.add(0);
            rightSpecialArr.add(0);
        }
        Stack<Integer> stack = new Stack<>();

        for(int i = A.size() - 1; i >=  0; i--)
        {
            while(!stack.isEmpty() && A.get(stack.peek()) < A.get(i))
                leftSpecialArr.set(stack.pop(), i);

            stack.push(i);
        }

        while(stack.isEmpty())
            leftSpecialArr.set(stack.pop(), -1);


        for(int i = 0; i < A.size(); i++)
        {
            while(!stack.isEmpty() && A.get(stack.peek()) < A.get(i))
                rightSpecialArr.set(stack.pop(), i);

            stack.push(i);
        }

        while(stack.isEmpty())
            rightSpecialArr.set(stack.pop(), A.size());

        long product = -1;
        int mod = (int)(1e9 + 7);

        for(int i = 0; i < A.size(); i++)
            product =  Math.max(product, (long)leftSpecialArr.get(i) * rightSpecialArr.get(i));

        return (int)(product % mod);

    }
}
