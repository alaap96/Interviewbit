public class Solution {
    /**
     * Store two numbers in one index using tricks. 
     * A = B + C * N;  <=>  B = A % N, C = A / N;
     */
    public void arrange(ArrayList<Integer> A) {
        int N = A.size();
        int code = A.size();
        for (int i = 0; i < N; i++) {
            int num = A.get(i);
            // encode the number 
            num = num + ((A.get(num)%code) * code);
            A.set(i, num);
        }
        for (int i = 0; i < N; i++) {
            //decode the number
            A.set(i, A.get(i) / code);
        }
    }
}	
