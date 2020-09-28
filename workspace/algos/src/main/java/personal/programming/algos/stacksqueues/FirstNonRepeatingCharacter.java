package personal.programming.algos.stacksqueues;

import java.util.*;

public class FirstNonRepeatingCharacter {

    public static void main(String []args){

    }

    public String solve(String A) {
        Deque<Character> deque = new ArrayDeque<>();
        StringBuilder B = new StringBuilder();
        Set<Character> characterSet = new HashSet<>();
        for(int i = 0 ;i<A.length();i++){
            char str = A.charAt(i);
            if(characterSet.contains(str)){
                deque.remove(str);
            }else{
                characterSet.add(str);
                deque.addLast(str);
            }

            if(deque.isEmpty()){
                B.append("#");
            }else{
                B.append(deque.peekFirst());
            }
        }

        return B.toString();
    }
}
