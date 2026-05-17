class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i=0;
        int[] arr= new int[2];
        int l=nums.length-1;
        boolean found=false;
        while(i<nums.length){
            if(nums[i]!=target){
                i++;
            }else{
                arr[1]=i;
                i++;
                found=true;
            }
             if(nums[l]!=target){
                l--;
                
            }else{
                arr[0]=l;
                l--;
                found=true;
            }
        }if(found){
            return arr;
        }
        arr[0]=-1;
        arr[1]=-1;
        return arr;

    }
}