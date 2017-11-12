public class Solution {
	public int romanToInt(String a) {
	    if(a.length() == 0)return 0;
	    int I = 1;
	    int V = 5;
	    int X = 10;
	    int L = 50;
	    int C = 100;
	    int D = 500;
	    int M = 1000;
	    int count = 0;
	    // Idea is to just subtract when needed and just add rest of chars
	    for(int i = 0; i < a.length(); i++){
	        // we have to delete the value only I follwed by V or X
	        if(i < a.length() - 1 &&a.charAt(i) == 'I' && (a.charAt(i+1) == 'V'||a.charAt(i+1) == 'X')){
	            count -= I;
	        }
	        // we have to delete the value only X follwed by L or C
	        else if(i < a.length() - 1 && a.charAt(i) == 'X' && (a.charAt(i+1) == 'L'||a.charAt(i+1) == 'C')){
	            count -= X;
	        }
	        // we have to delete the value only C follwed by D or M
	        else if(i < a.length() - 1 &&a.charAt(i) == 'C' && (a.charAt(i+1) == 'D'||a.charAt(i+1) == 'M')){
	            count -= C;
	        }
	        else{
	            // else just add value and keep going 
	            if(a.charAt(i) == 'I') count+=I;
	            else if(a.charAt(i) == 'V') count+=V;
	            else if(a.charAt(i) == 'X') count+=X;
	            else if(a.charAt(i) == 'L') count+=L;
	            else if(a.charAt(i) == 'C') count+=C;
	            else if(a.charAt(i) == 'D') count+=D;
	            else if(a.charAt(i) == 'M') count+=M;
	        }
	    }
	    return count;
	}
}
