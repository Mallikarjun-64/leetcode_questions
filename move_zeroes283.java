class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[j]==0){
                if(nums[j]!=nums[i]&&nums[i]!=0){
                    nums[j]=nums[j]^nums[i];
                     nums[i]=nums[j]^nums[i];
                      nums[j]=nums[j]^nums[i];
                    
                    j++;
                }

            }else{j++;}
        }
    }
}