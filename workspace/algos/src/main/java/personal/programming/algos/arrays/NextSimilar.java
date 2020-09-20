package personal.programming.algos.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NextSimilar {
    public static void main(String []args){
        System.out.println(solve("892795"));
    }

    public static String solve(String A) {
//        int []arr = new int[A.length()];
//        for(int i = 0;i<A.length();i++){
//            arr[i] = Character.getNumericValue(A.charAt(i));
//        }
//        int min = A.length()-1;
//        int i = A.length()-2;
//
//        for(;i>=0;i--){
//            if(arr[i]<arr[min]){
//                int temp = arr[i];
//                arr[i] = arr[min];
//                arr[min] = temp;
//                Arrays.sort(arr, i+1, arr.length);
//                break;
//            }else if (arr[i]==arr[min]){
//                int j = A.length()-1;
//                int exchangeIndex = j==min?j-1:j;
//                while (j>i){
//                    if(j!=min&&arr[j]>arr[min]){
//                        exchangeIndex = arr[j]>arr[exchangeIndex]?exchangeIndex:j;
//                    }
//                    j--;
//                }
//                int temp = arr[i];
//                arr[i] = arr[exchangeIndex];
//                arr[exchangeIndex] = temp;
//                Arrays.sort(arr, i+1, arr.length);
//                break;
//            }
//            min = Math.min(min,Integer.valueOf(A.charAt(i)));
//        }
//
//        StringBuilder result = new StringBuilder();
//        for(int j = 0;j<A.length();j++){
//            System.out.println(arr[j]);
//            result.append(arr[j]);
//        }
//        return A.equals(result.toString())?"-1":result.toString();
//    }
        if( A.length() == 1 ) return "-1" ;
        char [] ch = A.toCharArray() ;
        int n = ch.length ;

        Map<Integer, Integer> map = new HashMap<>();
        map.getOrDefault(0,0);
        map.size();

        int i = n-2 ;
        while( i>= 0 && ch[i] >= ch[i+1] )
        {
            i-- ;
        }

        if( i>= 0)
        {
            int j = n-1 ;

            while( j >= 0 &&  ch[j] <= ch[i]  )
            {
                j-- ;
            }

            swap( ch , i , j ) ;
        }

        reverse( ch , i+1 , n-1 ) ;



        String s = new String( ch ) ;

        return s ;

    }

    static void   swap ( char[] ch , int i , int j )
    {
        char temp = ch[i] ;
        ch[i] =  ch[j] ;
        ch[j] = temp ;
    }

    static void reverse( char ch[]  , int lo , int hi )
    {
        while( lo < hi )
        {
            char temp = ch[lo] ;
            ch[lo] =  ch[hi] ;
            ch[hi] = temp ;

            lo++ ;
            hi-- ;
        }
    }

    public boolean  dec ( char ch[] )
    {
        int i = 0 ;
        while( i <= ch.length -2 )
        {
            if( ch[i] >= ch[i+1] )
            {
                i++ ;
            }

            else{

                return false ;
            }

        }

        return true ;

    }

}
