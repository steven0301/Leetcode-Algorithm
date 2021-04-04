class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int cnt = 0;
        for(char e : s.toCharArray()){
            for(; i<t.length() ;i++){
                char ch = t.charAt(i);
                if(e == ch) {
                    i = i+1;
                    cnt++;
                    break;
                }
            }
        }
        return cnt==s.length()? true: false;
    }
}