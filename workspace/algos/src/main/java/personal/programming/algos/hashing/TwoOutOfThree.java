package personal.programming.algos.hashing;

import java.util.*;
import java.util.stream.Collectors;

public class TwoOutOfThree {

    public static void main(String []args){
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 1, 2));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(2,3));
        ArrayList<Integer> C = new ArrayList<>(Arrays.asList(3));
        System.out.println(solve(A,B,C));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
        Map<Integer, Integer> mapA = new HashMap<>();
        Map<Integer, Integer> mapB = new HashMap<>();
        Map<Integer, Integer> mapC = new HashMap<>();
        for(Integer i : A){
           if(!mapA.containsKey(i)){
               mapA.put(i,1);
           }
        }
        for(Integer i : B){
            if(!mapB.containsKey(i)){
                mapB.put(i,1);
            }
        }
        for(Integer i : C){
            if(!mapC.containsKey(i)){
                mapC.put(i,1);
            }
        }
        Set<Integer> numSet = new HashSet<>();
        for(Integer i : mapA.keySet()){
            if(mapB.containsKey(i)||mapC.containsKey(i)){
                numSet.add(i);
            }
        }
        for(Integer i : mapB.keySet()){
            if(mapA.containsKey(i)||mapC.containsKey(i)){
                numSet.add(i);
            }
        }
        for(Integer i : mapC.keySet()){
            if(mapB.containsKey(i)||mapA.containsKey(i)){
                numSet.add(i);
            }
        }
        ArrayList<Integer> numList = new ArrayList<>(numSet.stream().collect(Collectors.toList()));
        Collections.sort(numList);
        return numList;
    }
}
