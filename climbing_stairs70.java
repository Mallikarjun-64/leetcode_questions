class Solution {
    public int climbStairs(int n) {
        int a=1;
        int b=1;
        int next=a;
        for(int i=0;i<n;i++){
         next = a + b;
        a = b;
        b = next;
           
        }
        return a;
    }
   
}