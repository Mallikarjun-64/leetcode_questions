class Solution {
    public boolean check(int[] nums) {
        int c=0;
        int arr[]=nums.clone();
        Arrays.sort(arr);
     for(int i= 0;i<nums.length-1;i++){
        if(nums[i]>nums[i+1]){
            c++;
        }
     }  
     int k=0;
     for(int i=0;i<nums.length-1;i++){
        if(nums[i]>nums[i+1]){
            k=i+1;
            break;
        }
     }
     
     if(c>1){
        return false;
     }else if(c==1){
        for(int i=0;i<nums.length;i++){
            if(arr[i]!=nums[(i+k)%nums.length]){
                return false;
            }
            
        }

     }
     return true;
    }
}