/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
      public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval){
        ArrayList<Interval> result = new ArrayList<Interval>();
        // if size is 0 then just return newInterval
        int size = intervals.size();
        if(size == 0){
            result.add(newInterval);
            return result;
        }
        boolean inserted = false;
        // Insert the newInterval at its place in the arrayList (like in sorted order)
        for(int i = 0; i < size;i++){
            Interval iter = intervals.get(i);
            if(iter.start > newInterval.start){
                intervals.add(i, newInterval);
                inserted = true;
                break;
            }
        }
        // if no inserted in middle then insert at last of ArrayList
        if(!inserted)intervals.add(newInterval);
        return merge(intervals);
    }
    // new method to merge all the Intervals if needed
    public ArrayList<Interval> merge(ArrayList<Interval> intervals){
        Stack<Interval> st = new Stack<Interval>();
        st.push(intervals.get(0));
        int size = intervals.size();
        for(int i = 1; i < size;i++){
            Interval temp = intervals.get(i);
            Interval first = st.peek();
            if(first.end >= temp.start){
                st.pop();
                st.push(mergeInterval(first,temp));
            }else{
                st.push(temp);
            }
        }
        ArrayList<Interval> ans = new ArrayList<Interval>();
        while(!st.isEmpty()){
            ans.add(st.peek());
            st.pop();
        }
        // reverse all the intervals in the arrayList
        Collections.reverse(ans);
        return ans;
    }
    // methos to merger two intervals
    public Interval mergeInterval(Interval first, Interval second){
        Interval result = new Interval();
        result.start = Math.min(first.start,second.start);
        result.end = Math.max(first.end,second.end);
        return result;
    }
}
