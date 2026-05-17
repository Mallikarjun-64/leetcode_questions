class Solution {
    public char findTheDifference(String s, String t) {
   int n= s.length();
   int j=t.length();
   char sarr[]= new char[s.length()];
   char tarr[] =new char[t.length()];
   int i;
  for(i=0;i<n;i++){
    sarr[i]=s.charAt(i);
  }
  for(i=0;i<j;i++){
    tarr[i]=t.charAt(i);
  }
   Arrays.sort(sarr);
   Arrays.sort(tarr);
   for(i=0;i<sarr.length;i++){
    if(sarr[i]!=tarr[i]){
        return tarr[i];
        
    }
   }return tarr[tarr.length-1];
    }
    }
