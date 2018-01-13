public class Solution {
	// DO NOT MODFIY THE LIST. 
	public int maxSubArray(final List<Integer> a) {
	    // Initialize sum to zero and max to least possible number
	    int sum = 0;
	    int max = -99999;
	    int size = a.size();
	    //loop through list and add elements to sum
	    //if at any point of time sum becomes negetive set it to zero
	    // in every interation check is sum is greater than max if so set max to sum
	    for(int i = 0; i < size;i++){
	        sum += a.get(i);
	        if(sum > max)
	            max = sum;
	        if(sum < 0)
	            sum = 0;
	    }
	    //return max 
	    return max;
	}
}
