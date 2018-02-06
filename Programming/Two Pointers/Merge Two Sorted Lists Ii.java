public class Solution {
	public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
	    int j = 0;
	    for(int i = 0; i < a.size(); i++){
	        if(b.get(j) <= a.get(i)){
	            a.add(i,b.get(j));
	            j++;
	            if(j == b.size()) break;
	        }
	    }
	    while(j < b.size()){
	        a.add(a.size(),b.get(j));
	        j++;
	    }
	}
}
