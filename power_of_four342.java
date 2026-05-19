class Solution {
    public boolean isPowerOfFour(int n) {
        float i=n;
        if(n==1)return true;
        while(i>=1){
            i=i/4;
            if(i==1.0){
                return true;
            }
        }
        return false;
    }
}