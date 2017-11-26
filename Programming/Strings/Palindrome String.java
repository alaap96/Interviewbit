public class Solution {
	public int isPalindrome(String a) {
	    a = a.toLowerCase();
	    int i = 0;
	    int j = a.length() - 1;
	    // check until last is greater than first
	    while(j > i){
            //If a char is not alpha numeric go until you find a alpha numeric char.
            // we can also us Character.isLetterOrDigit(char)) function directly. 
	        while(!IsAlphaNumeric((a.charAt(i))) && i < j)i++;
	        while(!IsAlphaNumeric((a.charAt(j))) && j > i)j--;
	        if(a.charAt(i) != a.charAt(j))return 0;
	        i++;j--;
	    }
	    return 1;
	}
	public static boolean IsAlphaNumeric(char a){
	    // To check if a char is Alpha numeric 
	    if(!((a >= 'a' && a <= 'z') || (a >='0' && a <= '9'))) return false;
	    else return true;
	}
}
