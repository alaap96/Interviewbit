public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int hammingDistance(final List<Integer> A) {
        HashMap<String,Integer> store = new HashMap<String,Integer>();
        int size = A.size();
        int result = 0;
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                String s1 = Integer.toString(A.get(i));
                String s2 = Integer.toString(A.get(j));
                if(i == j){
                  continue; 
                }
                else if(store.containsKey(s2 + " "+ s1)){
                    result+=store.get(s2+" "+s1);
                }
                else if(store.containsKey(s1 + " "+ s2)){
                    result+=store.get(s1+" "+s2);
                }
                else{
                String ss1 = findDigitsInBinary(A.get(i));
                String ss2 = findDigitsInBinary(A.get(j));
                int temp =  sum(ss1,ss2);
                result+=temp;
                store.put(s2+ " " +s1, temp);
                }
            }
        }
        return result;
    }
    public static String findDigitsInBinary(int a) {
	    //StringBulder to return new String
	    StringBuilder sb = new StringBuilder();
	    // corner case if 0 return "0"
	    if(a == 0) {
	            return "0";
	        }
	    // approch is while a > 0; add number % 2; 
	    while(a > 0){
	            sb.append(a%2);
	            a = a / 2;
	    }
	    // reverse and return
	     return sb.toString();
	}
	public static int sum(String s1, String s2){
	    int size = Math.min(s1.length(),s2.length());
	    int size2 = Math.max(s1.length(),s2.length());
	    int count = 0;
	    for(int i = 0; i < size; i++){
	        if(s1.charAt(i) != s2.charAt(i)){
	            count++;
	        }
	    }
	    String max;
	    if(s1.length() > s2.length())
	    max = s1;
	    else
	    max = s2;
	    for(int i = size; i < size2; i++){
	        if(max.charAt(i) == '1')count++;
	    }
	    return count;
	}
}
