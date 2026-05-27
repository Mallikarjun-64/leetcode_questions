class Solution {
    public int[] concatWithReverse(int[] nums) {
        int arr[]=new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
                arr[i]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
                arr[i+nums.length]=nums[nums.length-1-i];
        }return arr;
    }
}