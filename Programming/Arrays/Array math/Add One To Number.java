public class Solution {
	public ArrayList<Integer> plusOne(ArrayList<Integer> a){
	    int size = a.size();
	    int carry = 1;
	    int num;
	    // Travesre in reverse order and add one to last element
	    // Maintain a carry number and update the number at last
	    for(int i = size - 1; i >= 0; i--){
	        num = a.get(i);
	        num += carry;
	        carry = 0;
	        if(num >= 10){
	            num = num%10;
	            carry = 1;
	        }
	        a.set(i,num);
	    }
	    // create a new array to store result
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    // In case carry is 1 then we need to add carry in front of the number
	    if(carry == 1){
	        result.add(carry);
	    }
	    // Then add all the remaining numbers
	    for(int i = 0; i < size; i++){
	        //we are checking if number is starting with 0's
	        // If first number is zero and we not add any number then we need to ignore that number
	        if(a.get(i) == 0 && result.size() == 0){
	            continue;
	        }
	        result.add(a.get(i));
	    }
	    return result;
	}
}
