public class Solution {
	// DO NOT MODIFY THE LIST
	public int singleNumber(final List<Integer> a) {
	    int size = a.size();
	    int num = a.get(0);
	    // if we XOR all number same numbers would nullify each other leaving the 
	    // the odd num out and we return that number.O(n)
	    for(int i = 1; i < size;i++){
	         num = num ^ a.get(i);
	    }
	    return num;
	}
}
