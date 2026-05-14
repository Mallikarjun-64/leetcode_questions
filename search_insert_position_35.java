class Solution {
    public int searchInsert(int[] nums, int target) {
       int h=nums.length-1;
        int l=0;
        int mid =0;
        while(l<=h){
            mid=(h+l)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                l=mid+1;

            }
            else{
                h=mid-1;
            }
        }return l;
    }
}