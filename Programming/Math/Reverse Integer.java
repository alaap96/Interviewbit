public class Solution {
	public int reverse(int a) {
	    boolean t = false;
	    if(a < 0) {
	        t = true;
	        a = -a;
	    }
	    int result = 0;
	    int prev = 0;
	    int i =0;
	    while(a>0){
	        result = (result * 10) + ((a%10));
	        // checking the over flow condition
	        if((result-a%10)/10 != prev)return 0;
	        prev = result ;
	        
	        a = a/10;
	        i++;
	    }
	    if(t)result = -result;
	    return result;
	}
}
