public class Solution {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> a) {
	    // create a hashmap to store and check the number if reapeted in O(1) time
	    HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();
	    int size = a.size();
	    for(int i = 0; i < size;i++){
	        //if contains key then return this is a duplicate 
	        if(map.containsKey(a.get(i))){
	                return a.get(i);
	        }
	        // else add it to the hashmap then we can compare it with the future numbers
	        else{
	            map.put(a.get(i), true);
	        }
	    }
	    // nothing is reapeted then return -1
	    return -1;
	}
}
