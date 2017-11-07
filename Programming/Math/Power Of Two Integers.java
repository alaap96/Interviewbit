public class Solution {
    public boolean isPower(int a) {
        if(a == 0)return true;
        if(a == 1)return true;
         
        for(int i = 2; i*i <= a;i++){
            int p = a;
            while(p%i == 0){
                p = p/i;
            }
            if(p==1)return true;
        }
        return false;
    }
}
