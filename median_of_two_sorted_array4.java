class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int n=nums1.length;
      int m=nums2.length;
      int[] arr=new int[m+n];
      for(int i =0;i<n;i++){
        arr[i]=nums1[i];
      }  
      for(int i=0;i<nums2.length;i++){
        arr[n+i]=nums2[i];
      }
      Arrays.sort(arr);
      double d=0.0;
      
      if(arr.length%2!=0){
        return arr[arr.length/2]/1.0;
      }
      return (arr[arr.length/2-1]+arr[arr.length/2])/2.0;
    }
}