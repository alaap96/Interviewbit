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
            // check each direction possiblity total 8 possiblities 
            while(true){
                if(present_x == target_x && present_y == target_y){
                    break;
                }
                else if(target_x > present_x && target_y > present_y){
                    present_x++;
                    present_y++;
                    count++;
                }
                else if(target_x < present_x && target_y > present_y){
                    present_x--;
                    present_y++;
                    count++;
                }
                else if(target_x < present_x && target_y < present_y){
                    present_x--;
                    present_y--;
                    count++;
                }
                else if(target_x > present_x && target_y < present_y){
                    present_x++;
                    present_y--;
                    count++;
                }
                else if(target_x == present_x && target_y < present_y){
                    present_y--;
                    count++;
                }
                else if(target_x == present_x && target_y > present_y){
                    present_y++;
                    count++;
                }
                else if(target_x > present_x && target_y == present_y){
                    present_x++;
                    count++;
                }
                else if(target_x < present_x && target_y == present_y){
                    present_x--;
                    count++;
                }
            }
        }
        return count;
    }
}
