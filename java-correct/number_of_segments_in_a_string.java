class Solution {
    public int countSegments(String s) {
        int cnt = 0;
        
        if(s.trim().length() == 0) return cnt;
        
        char prev = '*';
        for(char ch : s.trim().toCharArray()){
            if(ch == ' ' && prev != ' ') {
                cnt++;
            }
            prev = ch;
        }
        return cnt+1;
    }
}