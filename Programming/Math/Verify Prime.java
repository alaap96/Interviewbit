public class Solution {
	public int isPrime(int a) {
	    if(a == 1)return 0;
	    if(a == 2)return 1;
	    for(int i = 2; i <= Math.sqrt(a); i++){
	        if(a%i == 0)return 0;
	    }
	    return 1;
	}
}
