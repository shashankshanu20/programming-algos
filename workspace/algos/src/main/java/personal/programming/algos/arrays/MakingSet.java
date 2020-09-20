package personal.programming.algos.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MakingSet {
    public static void main(String []args){

    }

    public void setZeroes(ArrayList<ArrayList<Integer>> a) {

        Set<Integer> rowIndices = new HashSet<>();
        Set<Integer> colIndices = new HashSet<>();
        for(int i = 0; i < a.size(); i++){
            for(int j = 0; j<a.get(i).size(); j++){
                if(a.get(i).get(j)==0){
                    rowIndices.add(i);
                    colIndices.add(j);
                }
            }
        }

        for(int i = 0; i < a.size(); i++){
            for(int j = 0; j<a.get(i).size(); j++){
                if(rowIndices.contains(i)||colIndices.contains(j)){
                    a.get(i).set(j,0);
                }
            }
        }

    }
}
