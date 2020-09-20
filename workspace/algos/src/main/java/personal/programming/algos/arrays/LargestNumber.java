package personal.programming.algos.arrays;

import java.util.*;

public class LargestNumber {
    public static void main(String []args){
//        List<String> books = new ArrayList<>(Arrays.asList("Effective Java", "Algorithms", "DEMO","Refactoring" ));
//        System.out.println("Sorting List of String by length in JDK 7 ======");
//        System.out.println("The original list without sorting");
//        System.out.println(books);
//        Comparator<String> byLength = new Comparator<String>(){
//            @Override public int compare(String s1, String s2) {
//                String a  = s1 + s2;
//                String b  = s2 + s1;
//                return b.compareTo(a);
//            }
//        };
//        Arrays.sort(books, byLength);
//        System.out.println("The same list after sorting string by length");
        ArrayList<Integer> A = new ArrayList<>();
        A.add(3);
        A.add(2);
        A.add(1);
        int matrixDimension = 0;
        System.out.println(nextPermutation(A));
    }

  public static ArrayList<Integer> nextPermutation(ArrayList<Integer> A) {
    Boolean notFound = Boolean.TRUE;
    for (int i = A.size() - 1; i > 0; i--) {
      if (A.get(i) > A.get(i - 1)) {
        notFound = Boolean.FALSE;
        int temp = A.get(i);
        A.set(i, A.get(i - 1));
        A.set(i - 1, temp);
        break;
      }
    }
    if (notFound) {
      Collections.reverse(A);
    }
    return A;
    }
}
