class search_in_roteted_sorted_array33{
    public int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        } return -1;
    }
public static void main(String[] args){
    search_in_roteted_sorted_array33 s= new search_in_roteted_sorted_array33();
    int[] arr={3,4,5,6,1,2};
    System.out.println(s.search(arr,2));
}

}