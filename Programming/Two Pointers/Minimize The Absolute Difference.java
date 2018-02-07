public class Solution {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
        int i = 0, j = 0, k = 0;
        int ans = Integer.MAX_VALUE;
        while(i < A.size() && j < B.size() && k < C.size())
        {
            int max = Math.max(A.get(i), Math.max(B.get(j),C.get(k)));
            int min = Math.min(A.get(i), Math.min(B.get(j),C.get(k)));
            ans = Math.min(ans,(max - min));
            if(ans == 0)break;
            else if(min == A.get(i))i++;
            else if(min == B.get(j))j++;
            else k++;
        }
        return ans;
    }
}
