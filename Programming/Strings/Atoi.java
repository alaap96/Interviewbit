public class Solution {
	public int atoi(final String a) {
     int idx;
	    long number;
	    int size = a.length();
	    boolean sign = true;
	    
	    idx = 0;
	    
	    while (idx < size && a.charAt(idx) == ' ')
	        idx++;
	        
	    if (idx == size)
	        return 0;
	    
	    if (a.charAt(idx) == '-') {
	        sign = false;
	        idx++;
	    } else if (a.charAt(idx) == '+') {
	        idx++;
	    }
	    
	    number = 0;
    while (idx < size && a.charAt(idx) >= '0' && a.charAt(idx) <= '9') {
	        
	        number = Math.abs(number);
	        number = number * 10 + a.charAt(idx) - '0';
	        
	        if (!sign)
	            number = -number;
	        
	        if (number > Integer.MAX_VALUE)
	            return Integer.MAX_VALUE;
	            
	        else if (number < Integer.MIN_VALUE)
	            return Integer.MIN_VALUE;
	            
	        idx++;
	            

	    }
	    
	    return (int) number;
	    
	}
}
