package personal.programming.algos.arrays;

import java.util.*;

public class PermutationList {
    public static void main(String []args){
        List<String> primaryList = new ArrayList<>();
        primaryList.add("Solar Panel");
        List<String> secondaryList = new ArrayList<>();
        secondaryList.add("Umbrella");
        secondaryList.add("charger");
        secondaryList.add("charging");
        List<List<String>> finalList = new ArrayList<>();



        Set<String> stringSet = new HashSet<>();
        //
        for(String primaryWord: primaryList){
            String []strArray = primaryWord.split(" ");
            for(String str:strArray){
                stringSet.add(str.toLowerCase());
            }
        }
        for(String secondaryWord: secondaryList){
            String []strArray = secondaryWord.split(" ");
            for(String str:strArray){
                stringSet.add(str.toLowerCase());
            }
        }
        finalList.add(new ArrayList<>(stringSet));

        System.out.println(finalList);
        for(String primaryWord: primaryList){
            String []strArray = primaryWord.split(" ");
            for(String str:strArray){
                stringSet.add(str.toLowerCase());
            }
        }


    }
}
