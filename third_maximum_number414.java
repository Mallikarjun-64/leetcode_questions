class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        
        HashSet<Integer> set = new HashSet<>();
        if(nums.length<3){
            return nums[nums.length-1];
        }
        else{
       
        for(int num:nums){
            set.add(num);
        }
        int arr[] = new int[set.size()];
        int i = 0;
        for(int num:set){
            arr[i++]=num;
        }
        Arrays.sort(arr);
         if(arr.length<3){
            return arr[arr.length-1];
        }
        return arr[arr.length-3];
        }

       
    }
}