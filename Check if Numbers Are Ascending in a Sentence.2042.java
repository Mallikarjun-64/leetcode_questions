class Solution {
    public boolean areNumbersAscending(String s) {
        String num= s.replaceAll("\\D"," ");
        String[] nums=num.trim().split("\\s+");
        int arr[] =new int[nums.length];
        for(int i =0;i<nums.length;i++){
            arr[i]=Integer.parseInt(nums[i]);
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>=arr[i+1]){
                return false;
            }
        }
        return true;
    }
}