package personal.programming.algos.hashing;

import java.util.*;

public class IsValidSudoki {

    public static void main(String []args){
//        List<String> A = Arrays.asList("....5..1.", ".4.3.....", ".....3..1", "8......2.", "..2.7....", ".15......", ".....2...", ".2.9.....", "..4......");
        List<String> A = Arrays.asList(
                "..5.....6",
                "....14...",
                ".........",
                ".....92..",
                "5....2...",
                ".......3.",
                "...54....",
                "3.....42.",
                "...27.6..");
        System.out.println(isValidSudoku(A));
    }
    public static int isValidSudoku(final List<String> A) {

        Map<Integer, Set<Character>> rowMap = new HashMap<>();
        Map<Integer, Set<Character>> columnMap = new HashMap<>();
        Map<Integer, Set<Character>> boxMap = new HashMap<>();

        for(int i = 0;i<9;i++){
            rowMap.put(i,new HashSet<>());
            columnMap.put(i,new HashSet<>());
            boxMap.put(i,new HashSet<>());
        }
        for (int i = 0; i<A.size(); i++){
            for (int j = 0; j<A.get(i).length(); j++){
                Character charAt = A.get(i).charAt(j);
                if(charAt == '.'){
                    continue;
                }
                if(rowMap.get(i).contains(charAt) ||
                       columnMap.get(j).contains(charAt) ||
                         boxMap.get((i/3)*3 + j/3).contains(charAt)){
                    return 0;
                } else {
                    rowMap.get(i).add(charAt);
                    columnMap.get(j).add(charAt);
                    boxMap.get((i/3)*3 + j/3).add(charAt);
                }
            }
        }
        return 1;
    }


}
