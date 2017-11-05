public class Solution {
	public ArrayList<Integer> sieve(int a) {
	    // new arrayList to store result
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    // Travers through entire array
	    for(int i = 1; i < a; i++){
	        if(Isprime(i)){
	            result.add(i);
	        }
	    }
	    return result;
	}
	// function to check if a number is prime
	public static boolean Isprime(int a){
	    if(a == 1)return false;
	    if(a == 2)return true;
	    for(int i = 2; i <= Math.sqrt(a); i++){
	        if(a%i == 0)return false;
	    }
	    return true;
	}
}
