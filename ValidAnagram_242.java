import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        char arr[] = t.toCharArray();
        char arr1[] = s.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        String s1=new String(arr);
        String s2=new String(arr1);

        return s1.equals(s2);

    }
}