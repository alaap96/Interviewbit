public class Solution {
	public String findDigitsInBinary(int a) {
	    //StringBulder to return new String
	    StringBuilder sb = new StringBuilder();
	    // corner case if 0 return "0"
	    if(a == 0) {
	            return "0";
	        }
	    // approch is while a > 0; add number % 2; 
	    while(a > 0){
	            sb.append(a%2);
	            a = a / 2;
	    }
	    // reverse and return
	     return sb.reverse().toString();
	}
}
