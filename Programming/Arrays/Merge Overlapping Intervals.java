/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
 // new class for the sorting the objects with first number
class IntervalComparator implements Comparator<Interval>
{
    public int compare(Interval i1, Interval i2)
    {
        return i1.start - i2.start;
    }
}
public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        //if the intervals are given as sorted its ok or else sort the intervals first
        // here i am sorting all the intervals by default as it is not given in question
        Collections.sort(intervals, new IntervalComparator());
        //create new stack to store all the mergerd intervels
        Stack<Interval> st = new Stack<Interval>();
            int size = intervals.size();
            // first push an interval to the stack then campare it with the next interval
            // it we need to merge the both then first pop the existing intervals and 
            // push the newly merged interval.
            st.push(intervals.get(0));
            for(int i = 1; i < size; i++){
                int x1 = st.peek().end;
                int x2 = intervals.get(i).start;
                // if the end of first is greater then next start then they are overlapping 
                if(x1 >= x2){
                    // new interval for storing the merged interval
                    Interval interval = new Interval();
                    interval = MergeIntervals(st.peek(), intervals.get(i));
                    st.pop();
                    st.push(interval);
                }
                // if not over lapping then just push the new interval to stack
                else{
                    st.push(intervals.get(i));
                }
        }
        // create new array list to return the final merged array list
        ArrayList<Interval> result = new ArrayList<Interval>();
        while(!st.isEmpty()){
            result.add(st.pop());
        }
        Collections.reverse(result);
        intervals = result;
        return intervals;
    }
    // method to merge two intervals.
    Interval MergeIntervals(Interval start, Interval end){
        int start1 = Math.min(start.start,end.start);
        int end1 = Math.max(start.end,end.end);
        Interval interval = new Interval(start1, end1);
        return interval;
    }
}
