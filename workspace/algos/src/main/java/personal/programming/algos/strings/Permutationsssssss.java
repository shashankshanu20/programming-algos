//package personal.programming.algos.strings;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class Permutationsssssss {
//
//
//    public static void main(String []args){
//        List<String> primaryWordsList = Arrays.asList("emergency", "fermentation");
////        List<String> primaryWordsList = Arrays.asList("fermentation");
//        List<String> keywordCombinations = new ArrayList<>();
//        List<String> secondaryWordsList = Arrays.asList("biofuel","biomaterial","sugar","pentose","hexose","biomass");
////        List<String> secondaryWordsList = Arrays.asList("transmission","message","vehicle","communication");
//        for(int i=0;i<primaryWordsList.size();i++){
//            keywordCombinations.add(primaryWordsList.get(i));
//            StringBuilder words = new StringBuilder();
//            for(int j=0;j<secondaryWordsList.size();j++){
//                int k = 0;
//                while(k<=j){
//                    words.append(secondaryWordsList.get(k)+" ");
//                    k++;
//                }
//                keywordCombinations.add(primaryWordsList.get(i)+" "+words.toString().trim());
//                words = new StringBuilder();
//            }
//        }
//        keywordCombinations.stream().forEach(word->System.out.println(word));
//
//
//
//        ArrayList<Combination> combinations = getCombinations(products);
//
//        for (Combination combination : combinations) {
//            for (Product product : combination.getProducts()) {
//                System.out.print(product.getName() + " ");
//            }
//            System.out.println();
//        }
//
//    }
//
//    public static ArrayList<Combination> getCombinations(ArrayList<Product> products) {
//        ArrayList<Combination> combinations = new ArrayList<Combination>();
//        Set<Product> productsSet = new HashSet<Product>(products);
//        Set<Set<Product>> combinationsSet = Sets.powerSet(productsSet);
//        Iterator<Set<Product>> combinationsIterator = combinationsSet.iterator();
//        while (combinationsIterator.hasNext()) {
//            ArrayList<Product> productsList = new ArrayList<Product>(combinationsIterator.next());
//            Combination combination = new Combination(productsList);
//            combinations.add(combination);
//        }
//        return combinations;
//    }
//}
