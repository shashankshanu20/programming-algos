package personal.programming.algos.binarysearch;

import java.util.ArrayList;
import java.util.List;

public class SearchRange {
    public static void main(String []args){
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        System.out.println(searchRange(A,1));
    }

    public static int findleft(final List<Integer> A,int left,int right,int B){
        if(left<=right){
            int mid=(left+right)/2;
            if(A.get(mid)==B){
                if(mid==0||A.get(mid-1)!=B){
                    return mid;
                }
                else{
                    return findleft(A,left,mid-1,B);
                }
            }
            else if(A.get(mid)<B){
                return findleft(A,mid+1,right,B);
            }
            else{
                return findleft(A,left,mid-1,B);
            }
        }
        return -1;
    }
    public static int findright(final List<Integer> A,int left,int right,int B){
        if(left<=right){
            int mid=(left+right)/2;
            if(A.get(mid)==B){
                if(mid==A.size()-1||A.get(mid+1)!=B){
                    return mid;
                }
                else{
                    return findright(A,mid+1,right,B);
                }
            }
            else if(A.get(mid)<B){
                return findright(A,mid+1,right,B);
            }
            else{
                return findright(A,left,mid-1,B);
            }
        }
        return -1;
    }

    public static  ArrayList<Integer> searchRange(final List<Integer> A, int B) {
        ArrayList<Integer> result=new ArrayList<>();
        int startIndex=-1,endIndex=-1;
        startIndex=findleft(A,0,A.size()-1,B);
        endIndex=findright(A,0,A.size()-1,B);
        result.add(startIndex);
        result.add(endIndex);
        return result;
    }

}
