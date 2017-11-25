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
// if extra space is not to be used then check with reverse 
public class Solution {
	public boolean isPalindrome(int a) {
	    // check if reverse if the integer is same 
	  if(a == reverse(a)){
	      return true;
	  }else return false;
    }
    // function to check if reverse is also same
    public static int reverse(int a){
        int num = 0;
        while(a > 0){
            num = num*10 + a % 10;
            a = a/10;
        }
        return num;
    } 
}
