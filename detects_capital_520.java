class Solution {
    public boolean detectCapitalUse(String word) {
        boolean a=false;
       if(word.equals(word.toUpperCase())){
        a= true;
       } 
        else if(word.equals(word.toLowerCase())){
        a= true;
       }
       else if(Character.isUpperCase(word.charAt(0))){
       for(int i = 0;i<word.length()-1;i++){
         if(Character.isLowerCase(word.charAt(i+1))){
            a=true;
        }
        else{
            return false;
        }

       }
       }
       return a;
    }
}