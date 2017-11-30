public class Solution {
	public String longestCommonPrefix(ArrayList<String> a) {
	    String temp = "";
	    String prev = a.get(0);
	    for(int i = 1;i < a.size();i++){
	        String current = a.get(i);
	        int min = Math.min(prev.length(),current.length());
	        for (int j = 0;j < min;j++){
	            if (prev.charAt(j) == current.charAt(j)){
	                temp = temp + prev.charAt(j);
	            }
	            else break;
	        }
	        prev = temp;
	        temp = "";
	    }
	    return prev;
	}
}
