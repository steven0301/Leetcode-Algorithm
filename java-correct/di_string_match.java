class Solution {
    public int[] diStringMatch(String s) {
        int len = s.length();
        int low = 0;
        int high = len;
        int[] answer = new int[len+1];
        for(int i=0; i<len ;i++){
            if(s.charAt(i) == 'I') answer[i] = low++;
            else answer[i] = high--;
        }
        answer[len] = high;
        return answer;
    }
}