class Solution {
    public void reverseString(char[] s) {
        
        int len = s.length;
        for(int i=0; i<s.length/2 ;i++){
            char temp = s[len-1-i];
            s[len-1-i] = s[i];
            s[i] = temp;
        }
        
    }
}