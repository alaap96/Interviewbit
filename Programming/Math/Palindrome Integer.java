public class Solution {
	public boolean isPalindrome(int a) {
	    // convert to string
	   String s = Integer.toString(a);
	   int size = s.length();
	   // check if string is a palindrom
	    for(int i = 0; i < size/2 ; i++){
	        if(s.charAt(i) != s.charAt(size - 1- i)){
	            return false;
	        }
	    }
	    return true;
	}
}
