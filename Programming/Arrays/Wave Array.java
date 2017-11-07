public class Solution {
	public ArrayList<Integer> wave(ArrayList<Integer> a) {
	    Collections.sort(a);
	    int size = a.size();
	    // Idea is to travels list with 2 hops at a time and swaping i and i+1 values in list. 
	    for(int i = 0; i < size-1; i+=2){
	        int temp = a.get(i);
	        a.set(i,a.get(i+1));
	        a.set(i+1,temp);
	    }     
	    return a;
	}
}
