public class Solution {
	public String addBinary(String a, String b) {
	    // find smaller length string and place it in b then larger in a.
	    if(a.length() < b.length()){
	        String temp = a;
	        a = b;
	        b = temp;
	    }
	    // sum varialble to keep track of the sum of two binary numbers at a given point
	    int sum = 0;
	    // to store final result
	    StringBuilder sb = new StringBuilder();
	    // carry to keep track of carry 
	    int carry = 0;
	    // find out diff of lengths so that we will not consider second string after
	    // i will be less than diff, since there are all 0's.(I am adding 0's instead assuming)
	    int diff = a.length() - b.length();
	    int size = a.length()-1;
	    for(int i = size; i >= 0 ; i--){
	        if(i < diff){
	            if(carry == 1) {
	                 sum = carry + get_int(a.charAt(i));
	                carry = 0;
	            }
	            else  sum =  get_int(a.charAt(i));
	            sb.append(sum);
	        }
	        else{
	            sum = carry + get_int(a.charAt(i)) + get_int(b.charAt(i - diff));
	            carry = 0;
	            if(sum > 1){
	            carry = 1;
	            sum = 1;
	            }
	            sb.append(sum);
	        }
	          
	    }
	    if(carry == 1)sb.append('1');
	    return sb.reverse().toString();
	}
	// method to return the int for given binary char 0 or 1.
	public static int get_int(char a){
	    if(a == '0')return 0;
	    else return 1;
    }
}
	
