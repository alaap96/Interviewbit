public class Solution {
	public int titleToNumber(String a) {
	    int size = a.length();
	    if(size == 0)return 0;
	    int count = 0;
	    int s = size - 1;
	    // approch is to multiple char with 26 power of (size -1)
	    for(int i = 0; i < size;i++){
	        if(s > 0){
	            count += ((int)a.charAt(i) - 64) * Math.pow(26,s); 
	            s--;
	        }
	        else
	        count += ((int)a.charAt(i) - 64); 
	    }
	    return count;
	}
}
