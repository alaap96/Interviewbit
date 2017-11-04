public class Solution {
    // X and Y co-ordinates of the points in order.
    // Each point is represented by (X.get(i), Y.get(i))
    public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        int count = 0;
        for(int i = 0; i < X.size()-1; i++){
            int present_x = X.get(i);
            int present_y = Y.get(i);
            int target_x = X.get(i+1);
            int target_y = Y.get(i+1);
            // Max value of absolute diff for x2-x1 and y2-y1 will be the minnimum steps 
            // requried to travel.
            count += Math.abs(Math.max(Math.abs(target_x - present_x),Math.abs(target_y - present_y)));
        }
        return count;
    }
}
