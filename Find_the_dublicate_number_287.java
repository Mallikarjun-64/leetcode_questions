class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i;
        int k = 0;
        for(i=0;i<nums.length-1;i++){
            if((nums[i]^nums[i+1])==0){
                k=i; 
            }
        } return nums[k];
      }
    }

        /* first i tried this approch because i thougt that the time           complexity of this code is O(n). BUt i was wrong,this for loop act as a nested loop then i thougth about xor operator*/
        // int i;
        // int j=0;
        // int k=0;
        // for(i=1;i<nums.length;i++){
            
        //     if(nums[j]==nums[i]){
        //         return nums[i];
        //     }
        //     if(i==nums.length-1){
        //         j++;
        //         i=j;
        //     }

      // }return nums[k];
//     }
// }