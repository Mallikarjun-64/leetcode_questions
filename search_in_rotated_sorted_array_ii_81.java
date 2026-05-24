class Solution {
    public boolean search(int[] nums, int target) {
        int s=0;
        int l=nums.length-1;
        if(nums[0]==target || nums[l]==target){return true;}
        while(s<l){
            if(nums[s]==target || nums[l]==target){return true;}
            int mid=(s+l)/2;
            if(nums[mid]==target){
                return true;
            }
            else if(nums[s]==nums[mid] && nums[l]==nums[mid]){l--;s++;}
            else if(nums[s]<=nums[mid]){
                if(nums[s]<=target&&nums[mid]>target){
                    l=mid-1;
                }else{
                    s=mid+1;
                }
            }else
            {
                if(nums[l]>=target&&nums[mid]<target){
                    s=mid+1;
                }else{
                    l=mid-1;
                }
                }
        
        }return false;
    }
}

//we can use linear search but time complexity becomes O(n)