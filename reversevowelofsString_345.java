class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        StringBuilder sb = new  StringBuilder(s);
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if (vowels.indexOf(sb.charAt(l)) == -1) {
                l++;
            } 
            else if (vowels.indexOf(sb.charAt(r)) == -1) {
                r--;
            } else{
                char temp = sb.charAt(l);
                 sb.setCharAt(l,  sb.charAt(r));
                 sb.setCharAt(r,temp);
                 l++;
                 r--;
            }
        }return sb.toString();
    }
}