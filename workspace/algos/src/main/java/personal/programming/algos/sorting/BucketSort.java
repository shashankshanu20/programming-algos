package personal.programming.algos.sorting;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class BucketSort {
    public static void main(String []args){
        System.out.println("---------- Counting Sort ---------");
        List<Integer> array = Arrays.asList(23, 45, 11, 47, 2, 23, 65, 24);
        System.out.println("Before sorting...");
        System.out.println(array);
//        bucketSort(array);
        System.out.println("After sorting...");
        System.out.println(array);
        long fromtimesta = 1593578317;
        long totimesta = 1596170317;
        System.out.println("long timestamp : (from )"+fromtimesta*1000+", to : "+totimesta*1000);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(fromtimesta*1000);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        long lowerEnd = calendar.getTimeInMillis();
        calendar.setTimeInMillis(totimesta*1000);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 0);
        long upperEnd = calendar.getTimeInMillis();
        System.out.println("lowerend  : "+lowerEnd);
        System.out.println("upperend  : "+upperEnd);
        String year = "202008".substring(0,4);
        String week = "202008".substring(4);
        System.out.println("year  : "+Integer.parseInt(year));
        System.out.println("week  : "+Integer.parseInt(week));
    }
}
