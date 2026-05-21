class Solution {
    public boolean checkString(String s) {
       int n=s.length();
        int k=0;
        if(s.length()>=2){
            if(s.charAt(0)=='b'&& s.charAt(1)=='a'){
                return false;
            }
        }
        // boolean m=false;
        for(int i=0;i<n;i++){
            if(s.charAt(i)!='a'){
              k++;  
            }
        }
        if(k==n){
            return true;
        }
        int z=0;
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                z++;
            }

        }
        if(z<2){
            return true;
        }
        
        return false;
    }
}