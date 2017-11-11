public class Solution {
	public String countAndSay(int a) {
	     // start String s with "1" as a = 1
	     String S = "1";
	     if(a == 0)return "";
	     // if a = 1 return S;
	     if(a == 1)return S;
	     // if a is more than 1 then get the value of a step by step
	     for(int i = 2; i <= a; i++){
	         // updating s for every step 2, 3, 4 .... so on
	         S = Convert(S);
	     }
	     return S;
	}
	// Method to update String for next number 1 number at a time
	public static String Convert(String S){
	    // store result in a string builder
	    StringBuilder sb = new StringBuilder();
	    // iterate through string once 
	    for(int i = 0; i < S.length(); i++){
	        // first count is always minimum 1 if in case 111 or 222 count is 3
	        int count = 1;
	        char number = S.charAt(i);
	        // To find how many same side by side chars like 111
	        while(i < S.length() - 1 && S.charAt(i) == S.charAt(i+1)){
	            count++;i++;
	        }
	        // Idea is to append count followed by number
	        sb.append(count);
	        sb.append(number);
	    }
	    return sb.toString();
	}
}
