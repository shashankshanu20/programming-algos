package personal.programming.algos.arrays;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;


class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Interval interval = (Interval) o;
        return start == interval.start &&
                end == interval.end;
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    @Override
    public String toString() {
        return "Interval{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}

public class MergeIntervals {
    public static void  main(String []args){
        ArrayList<Interval> intervals = new ArrayList<>();
        Interval interval = new Interval(2,6);
//        System.out.println(insert(intervals, interval));
        intervals.add(interval);
        interval = new Interval(1,3);
        intervals.add(interval);
        interval = new Interval(8,10);
        intervals.add(interval);
        interval = new Interval(15,18);
        intervals.add(interval);
        System.out.println(merge(intervals));

        // take start of the interval to
        // iterate through the interval list
        // compare start & end with insertion interval
        // if insertion start is less than current start
        // maintain startinsertion index  = & is replaceStart true
        //
        // if insertion start lies in the range check startInsertion Index true
        //
    }

    public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        if(intervals.size()==1||intervals.isEmpty()){
            return intervals;
        }
        Collections.sort(intervals, (interval1, interval2)->  interval1.start<interval2.start?-1:1);

        for(int i=0;i<intervals.size()-1;i++){
            if(intervals.get(i+1).start<intervals.get(i).end){
                if(intervals.get(i+1).end>intervals.get(i).end){
                    intervals.get(i).end = intervals.get(i+1).end;
                }
                intervals.remove(i+1);
                i--;
            }else if(intervals.get(i+1).start==intervals.get(i).end){
                if(intervals.get(i+1).end>intervals.get(i).end){
                   intervals.get(i).end = intervals.get(i+1).end;
                }
                intervals.remove(i+1);
                i--;
            }
        }


        return intervals;
    }

    public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        if(intervals.isEmpty()){
            intervals.add(newInterval);
            return intervals;
        }
        int startIndex = -1;
        int n = intervals.size();
        Boolean startIndexFound = Boolean.FALSE;
        Boolean endIndexFound = Boolean.FALSE;
        int endIndex = -1;
        int currentStartIndex  = -1;
        int currentEndIndex  = -1;
        int startInsertIndex  = -1;
        int currentIndex  = -1;
        for(int i=0;i<n;i++){
            if(newInterval.end < intervals.get(i).start){
                intervals.add(i,newInterval);
                return intervals;
            }
            else if(newInterval.start > intervals.get(i).end){
            }
            else if(newInterval.start <= intervals.get(i).start && newInterval.end >= intervals.get(i).start && newInterval.end <= intervals.get(i).end){
                newInterval.end = intervals.get(i).end;
                intervals.remove(i);
                i--;
            }
            else if(newInterval.start >= intervals.get(i).start && newInterval.end <= intervals.get(i).end){
                return intervals;
            }
            else if(newInterval.start >= intervals.get(i).start && newInterval.start <= intervals.get(i).end && newInterval.end >= intervals.get(i).end){
                newInterval.start = intervals.get(i).start;
                intervals.remove(i);
                i--;
            }
            else if(newInterval.start <= intervals.get(i).start && newInterval.end >= intervals.get(i).end){
                intervals.remove(i);
                i--;
            }
        }
        intervals.add(newInterval);
        return intervals;
    }
}
