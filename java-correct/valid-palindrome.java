class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length()-1;
        
        while(left <= right){
            if(Character.isLetterOrDigit(s.charAt(left)) == false) left++;
            else if(Character.isLetterOrDigit(s.charAt(right)) == false) right--;
            else if (s.charAt(left) == s.charAt(right)){
                left++; right--;
            }else {
                return false;
            }
        }
        
        return true;
    }
}