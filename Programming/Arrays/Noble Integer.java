public class Solution {
    public int solve(ArrayList<Integer> A) {
        // sort the Array so it becomes easy to check greater numbers
        Collections.sort(A);
        int size = A.size();
        for(int i = 0; i < size; i++){
            // this is a corner case
            // In case of duplicates just move on because only greater numebers are needed
            if(i < size -1 && A.get(i) == A.get(i+1)) continue;
            // This is the condition to check
            // If present number is equal to count of next numbers 
            else if(A.get(i) == size - 1 - i){
                return 1;
            }
        }
        return -1;
    }
}
