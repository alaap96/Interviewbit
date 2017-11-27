public class Solution {
	public int numSetBits(long a) {
	    int count = 0;
	    // See how many set bits are there in the given number O(n)
	    while(a > 0){
	        if(a%2 == 1)count++;
	        a = a/2;
	    }
	    return count;
	}
}
