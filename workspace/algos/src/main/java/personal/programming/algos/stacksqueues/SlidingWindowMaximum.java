package personal.programming.algos.stacksqueues;

import java.util.*;

public class SlidingWindowMaximum {

    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {

//        ArrayList<Integer> result = new ArrayList<>();
//        if(B>=A.size()){
//            int maxVal = Integer.MIN_VALUE;
//            for(Integer i:A){
//                maxVal = Math.max(i,maxVal);
//            }
//            result.add(maxVal);
//            return result;
//        }
//
//
//        for(int i = 0;i+B-1<A.size();i++){
//
//            int count  = 0;
//            int maxVal = Integer.MIN_VALUE;
//            for(int j = i;count<B;j++){
//                maxVal = Math.max(maxVal,A.get(j));
//                count++;
//            }
//            result.add(maxVal);
//        }

//        return result;

        Deque<Integer> deque= new ArrayDeque<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<B;++i)
            insertNextIndexToWindow(deque, A, i);
        result.add(A.get(deque.getFirst()));


        for(int i=B;i<A.size();++i) {
            if (deque.getFirst() == i-B)
                deque.pollFirst();
            insertNextIndexToWindow(deque, A, i);
            result.add(A.get(deque.getFirst()));
        }

        return result;
    }


    public void insertNextIndexToWindow(Deque<Integer> deque, List<Integer> A, int index)
    {
        while (!deque.isEmpty() && A.get(deque.getLast()) < A.get(index))
            deque.pollLast();
        deque.addLast(index);
    }
}
