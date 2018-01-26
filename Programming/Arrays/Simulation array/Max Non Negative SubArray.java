public class Solution {
    public ArrayList<Integer> maxset(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        long max = Integer.MIN_VALUE;
        long sum = 0;
        for(int i = 0; i < A.size(); i++){
            if(A.get(i) >= 0){
                sum += A.get(i);
                temp.add(A.get(i));
                
            }else{
                sum = 0;
                temp = new ArrayList<Integer>();
            }
            if ((sum > max) || ((max == sum) && (temp.size() > result.size()))){
	            max = sum;
	            result = temp;
	        }
        }
        return result;
    }
}
