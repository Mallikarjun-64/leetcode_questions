class Solution {
    public int findMin(int[] nums) {
       int m=0;
       int l=nums.length-1;
        while(m<l){
            int mid=(m+l)/2;
            if(nums[mid]>nums[l]){
                m=mid+1;
            }else{
                l=mid;
            }
        }return nums[m];
        
    }
}