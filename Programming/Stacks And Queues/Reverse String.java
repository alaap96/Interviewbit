public class Solution {
	public String reverseString(String a) {
	   // return new StringBuilder(a).reverse().toString(); this line can do all :)
	    int size = a.length();
	    if(size == 0)return "";
	    Stack<Character> st = new Stack<Character>();
	    for(int i = 0; i < size; i++){
	        st.push(a.charAt(i));
	    }
	    StringBuilder sb = new StringBuilder();
	    while(!st.isEmpty()){
	        sb.append(st.peek());
	        st.pop();
	    }
	    return sb.toString();
	}
}
