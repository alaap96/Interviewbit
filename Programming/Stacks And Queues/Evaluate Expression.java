public class Solution {
	public int evalRPN(ArrayList<String> a) {
	    Stack<Integer> st = new Stack<Integer>();
	    for(int i = 0; i < a.size() ; i++){
	        String current = a.get(i);
	       if(current.equals("/") || current.equals("+") || current.equals("-") || current.equals("*")){
	           int first = st.peek(); st.pop();
	           int second = st.peek();st.pop();
    	        if(current.equals("+")){st.push(second+first);}
    	        else if(current.equals("-")){st.push(second-first);}
    	        else if(current.equals("/")){st.push(second/first);}
    	        else{st.push(second*first);}
	       }
            else{st.push(Integer.valueOf(current));}
	    }
	    return st.peek();
	}
}
