class Solution {
    public int maximumCount(int[] nums) {
      int s=(nums.length)/2;
      int count=0;
      int zero=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]<0){
            count++;
        } 
        if(nums[i]==0){
            zero++;
        }
      }
      if(count<s){
            return nums.length-count-zero;
        }
        if(nums.length==3){
            if(count<=s){
            return nums.length-count-zero;
        }
        }
      return count;
    }
}