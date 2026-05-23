class Solution {
    public int findMin(int[] nums) {
        int s =0;
        int l=nums.length-1;
        while(s<l){
            int mid=(s+l)/2;
            if(nums[mid]==nums[l]){
                l--;
            }
            else if(nums[mid]>nums[l]){
                s=mid+1;
            }else{
                l=mid;
            }
        }return nums[l];
    }
}