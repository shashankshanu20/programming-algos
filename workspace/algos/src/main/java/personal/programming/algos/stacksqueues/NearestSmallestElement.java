package personal.programming.algos.stacksqueues;

import java.util.ArrayList;
import java.util.Stack;

public class NearestSmallestElement {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        ArrayList<Integer> result =  new ArrayList<Integer>()  ;
        Stack<Integer> stack =  new Stack<Integer>()  ;

        if( A.size() == 1 )
        {
            result.add(-1)  ;
            return result  ;
        }


        for( int i = 0  ; i < A.size() ; i++ )
        {
            if( stack.size() == 0  )
            {
                result.add(-1)  ;
            }
            else if( stack.size() > 0  && stack.peek() < A.get(i) )
            {
                result.add(stack.peek() ) ;
            }
            else if( stack.size() > 0  && stack.peek() >= A.get(i))
            {
                while( stack.size() > 0  && stack.peek() >= A.get(i))
                {
                    stack.pop() ;
                }

                if( stack.size() == 0 )
                {
                    result.add(-1)  ;
                }
                else{
                    result.add( stack.peek() )  ;
                }
            }

            stack.push( A.get(i) ) ;
        }

        return result  ;
    }

}
