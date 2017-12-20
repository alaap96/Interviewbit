public class Solution {
	public ArrayList<Integer> twoSum(final List<Integer> a, int b) {
	    //ArrayList for answer
	    ArrayList<Integer> ans = new ArrayList<Integer>();
	    //HashMap 
	    HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
	    
	    for(int i = 0; i < a.size(); i++){
	        int cur = a.get(i);
	        int target =  b - cur;
	        if(hash.containsKey(target)){
	            ans.add(Math.min(i+1,hash.get(target)));
	            ans.add(Math.max(i+1,hash.get(target)));
	            return ans;
	        }else{
	            //We do not allow duplicates and store the one with least index1
	           if(!hash.containsKey(cur))
	            hash.put(cur,i+1);
	        }
	    }
	    return ans;
	}
}
