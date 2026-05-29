class Solution {
    public int minElement(int[] nums) {
        for(int i=0; i<nums.length;i++){
            int total =0;
            while(nums[i]!=0){
                total+=nums[i]%10;
                nums[i]/=10;
            }
            nums[i]=total;
        }
        Arrays.sort(nums);
        return nums[0];
    }
}