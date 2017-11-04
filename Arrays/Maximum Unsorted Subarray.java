public class Solution {
    public ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
        // create a new ArrayList to copy first ArrayList
        ArrayList<Integer> B = new ArrayList<Integer>(A);
        Collections.sort(B);
        int start = 0;
        int end = 0;
        int size = A.size();
        boolean first = true;
        // compare all elements and find start and end points
        for(int i = 0; i < size;i++){
            if(A.get(i) != B.get(i)){
                if(first){
                    start = i;
                    first = false;
                }
                else{
                    end = i;
                }
            }
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        //If nothing is needed then return -1;
        if(start == 0 && end == 0){
           result.add(-1);
           return result;
        }
        //add start and end to list and return list
        result.add(start);
        result.add(end);
        return result;
    }
}
