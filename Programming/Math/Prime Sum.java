public class Solution {
    public ArrayList<Integer> primesum(int a) {
        // ArrayList for result
        ArrayList<Integer> result = new ArrayList<Integer>();
        // If number is odd then return empty arraylist(no need)
        if(a%2 == 1)return result;
        // Apporch is to traverse through the entire 2 to number 
        // Check if number is prime then check number - i is a prime
        // If both are prime then return the both number by min, max format
        for(int i = 2; i < a;i++){
            if(IsPrime(i)){
                if(IsPrime(a-i)){
                    result.add(Math.min(i,a-i));
                    result.add(Math.max(i,a-i));
                    return result;
                }
            }
        }
        return result;
    }
    //Is prime function
    public static boolean IsPrime(int a){
        if(a == 0)return false;
        if(a == 1)return false;
        if(a == 2)return true;
        for(int i = 2; i <= Math.sqrt(a); i++){
            if(a%i == 0)return false;
        }
        return true;
    }
}
