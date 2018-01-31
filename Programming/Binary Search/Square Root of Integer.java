public class Solution {
	public int sqrt(int a) {
	    if(a == 0 || a ==1) return a;
	    long start = 0;
	    long end = a;
	    long mid = (start + end)/2;
	    while(start <= end){
	        if(mid*mid == a) return (int)mid;
	        else if(mid*mid > a) end = mid - 1;
	        else start = mid + 1;
	        mid = (start + end)/2;
	    }
	    return (int)mid;
	}
}
