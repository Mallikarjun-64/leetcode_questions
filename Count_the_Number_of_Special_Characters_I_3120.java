import java.util.*;
class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> small = new HashSet<>();
        HashSet<Character> big = new HashSet<>();
        int count=0;
        for(int i=0;i<word.length();i++){
            if(Character.isLowerCase(word.charAt(i))){
                small.add(word.charAt(i));
            }
        }
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                big.add(word.charAt(i));
            }
        }
        char arr[] = new char[small.size()];
        int i=0;
        for(char ch:small){
            arr[i++]=Character.toUpperCase(ch);
        }
        for(int j=0;j<arr.length;j++){
            if(big.contains(arr[j])){
                count++;
            }
        }
        return count;
    }
}