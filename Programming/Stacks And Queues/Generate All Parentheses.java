public class Solution {
	public int isValid(String a) {
	    Stack<Character> st = new Stack<Character>();
	    int size = a.length();
	    if(size == 0)return 1;
	    // go char by char
	    for(int i = 0; i < size; i++){
	        char item = a.charAt(i);
	        if(!st.isEmpty() && st.peek() == '(' && item == ')'){st.pop();}
	        else if(!st.isEmpty() && st.peek() == '{' && item == '}'){st.pop();}
	        else if(!st.isEmpty() && st.peek() == '[' && item == ']'){st.pop();}
	        else{st.push(item);}
	    }
	    if(st.isEmpty()){return 1;}
	    else return 0;
	}
}
