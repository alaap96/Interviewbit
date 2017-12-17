public class Solution {
	public int power(String A) {
	    // create a big integer from string A
	    java.math.BigInteger a = new java.math.BigInteger(A);
	    // if it is zero or 1 then return 0;
        if(a.compareTo(java.math.BigInteger.ONE)==0 || a.compareTo(java.math.BigInteger.ZERO)==0)return 0;
        // if number of set bits are 1 then true else false. 
        // numbers divisible by 2 have only one set bit
        if(a.bitCount() != 1)return 0;
        else return 1;
	}
}
