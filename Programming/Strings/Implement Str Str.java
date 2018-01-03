public class Solution {
	public int strStr(final String haystack, final String needle) {
	    //If both haystack or needle are empty return -1
	    if(haystack.length() == 0 || needle.length() == 0)return -1;
	    // Check if current char and first letter of needle are same.
	    // If so check if next chars are equal
	    for(int i = 0; i < haystack.length() - needle.length() + 1; i++){
	        char cur = haystack.charAt(i);
	        if(cur == needle.charAt(0)){
	            for(int j = 0;j < needle.length();j++){
	                current = haystack.charAt(i + j);
	                if(current != needle.charAt(j))break;
	                // if we reached end // all the chars in needle are same in haystack
	                if(j == needle.length() -1)return i;
	            }
	        }
	    }
	    return -1;
	}
}
