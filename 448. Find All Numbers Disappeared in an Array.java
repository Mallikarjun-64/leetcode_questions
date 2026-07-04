class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> lst = new ArrayList<>();
       HashSet<Integer> set =new HashSet<>();
       int i=0;
        for(int num:nums){
            set.add(num);
        }
        for(int k=1;k<nums.length+1;k++){
            if(!set.contains(k)){
                lst.add(k);
            }   
        }
    return lst;
    }
}