class Solution {
    public boolean isPalindrome(int x) {
        int i,sum=0,rev=0;
        int j = x;
        while(x>0){
            i=x%10;
            rev=sum*10+i;
            sum=rev;
            x/=10;
        }
        return j==rev;
    }
}