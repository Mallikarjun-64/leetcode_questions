class TwoSum_1 {
    public int[] twoSum(int[] nums, int target) {
        
        int[] arr1= new int[2];

        for( int i = 0; i<nums.length-1;i++){
            for( int j = i+1; j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                    arr1[0]=i;
                    arr1[1]=j;
                
                
                }
            }
        }
        return arr1;
    }
    public static void main(String[] args) {
        int[] nums = {5, 6, 3, 5};

        TwoSum_1 obj = new TwoSum_1();
        int[] result = obj.twoSum(nums, 9);

        System.out.println(result);
    }
}