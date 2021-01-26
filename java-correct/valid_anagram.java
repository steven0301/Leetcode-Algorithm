import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String str1 = new String(arr1);
        String str2 = new String(arr2);
                
        return str1.compareTo(str2) == 0 ? true : false;
        
    }
}