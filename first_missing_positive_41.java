import java.util.*;
class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        Arrays.sort(nums);
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                return i;
            }
        }return nums[nums.length-1]+1;
    }
}