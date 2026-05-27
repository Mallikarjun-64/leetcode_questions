import java.util.HashSet;
class Solution {
    public int firstUniqueEven(int[] nums) {
       HashSet<Integer> set=new HashSet<>();
       HashSet<Integer> dub=new HashSet<>();
       for(int num:nums){
        if(set.contains(num)){
            dub.add(num);
        }else{set.add(num);}
       }
       for(int num:nums){
        if(((num%2)==0) && (!dub.contains(num))){
            return num;
        }
       }return -1;
    }
}