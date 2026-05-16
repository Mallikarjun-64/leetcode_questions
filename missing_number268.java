class Solution {
    public int missingNumber(int[] nums) {
        
        int sum=(nums.length*(nums.length+1))/2;
        int cursum=0;
        int i;

        for(i =0;i<nums.length;i++){
            cursum+=nums[i];
        }return sum-cursum;
    }
}