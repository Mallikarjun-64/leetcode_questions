class Solution {
    public int maxProfit(int[] prices) {
        int i;
        int j=0;
        int sum=0;
        int sum1=0;
        for(i=0;i<prices.length;i++){
            sum=prices[i]-prices[j];
            if(sum>=sum1){
                sum1=sum;
            }
            if(prices[i]<=prices[j]){
                j=i;
            }
           
        }return sum1;
    }
}