package personal.programming.algos.trees;

import java.util.*;

public class HotelReviews {

    class GoodReview implements Comparable<GoodReview>{
        int index;
        int goodReviewWordsLength;
        String review;
        public GoodReview(String review , int goodReviewWordsLength , int index)
        {
            this.review = review;
            this.goodReviewWordsLength = goodReviewWordsLength;
            this.index = index;
        }
        @Override
        public int compareTo(GoodReview o) {
            if(this.goodReviewWordsLength!=o.goodReviewWordsLength){
                return this.goodReviewWordsLength>o.goodReviewWordsLength?-1:1;
            }else{
                return this.index<o.index?-1:this.index==o.index?0:1;
            }
        }
    }

    public ArrayList<Integer> solve(String A, ArrayList<String> B) {
        Set<String> goodWordsSet = new HashSet<>();
        for(String word:A.split("_")){
            goodWordsSet.add(word);
        }
        List<GoodReview> goodReviewList = new ArrayList<>();
        int indexCount = 0;
        for(String review : B){
            GoodReview goodReview = new GoodReview(review,calculateReviewLength(review,goodWordsSet),indexCount);
            goodReviewList.add(goodReview);
            indexCount++;
        }
        Collections.sort(goodReviewList);
        ArrayList<Integer> result = new ArrayList<>();
        goodReviewList.stream().forEach(goodReview -> {result.add(goodReview.index);});
        return result;
    }

    public int calculateReviewLength(String review, Set<String> goodWordsSet){
        int goodWordsCount=0;
        for(String word:review.split("_")){
            if(goodWordsSet.contains(word)){
                goodWordsCount++;
            }
        }
        return goodWordsCount;
    }
}
