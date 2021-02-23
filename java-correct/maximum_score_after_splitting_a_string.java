class Solution {
    public int maxScore(String s) {
        int max = -1;
        for(int i=1; i<s.length() ;i++){            
            int temp = checkNumber(s.substring(0,i), '0') + checkNumber(s.substring(i,s.length()), '1');
            if(max < temp) max = temp;
        }
        return max;
    }
    
    public int checkNumber(String str, char c){
        int cnt = 0;
        for(int i=0; i<str.length() ;i++){
            char ch = str.charAt(i);
            if(ch == c) cnt++;
        }
        return cnt;
    }
}