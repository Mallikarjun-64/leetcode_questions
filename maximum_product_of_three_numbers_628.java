import java.util.Arrays;
class Solution {
    public int maximumProduct(int[] nums) {
        int k=nums.length-1;
        Arrays.sort(nums);
        int max1= nums[k]*nums[k-1]*nums[k-2];
        int max2= nums[0]*nums[1]*nums[k];
        return Math.max(max1,max2);
    }
}