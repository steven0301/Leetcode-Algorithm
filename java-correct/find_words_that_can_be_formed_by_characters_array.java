class Solution {
    public int countCharacters(String[] words, String chars) {
        int cnt = 0;
        int[] alphaMap = new int[26];
        for(char ch : chars.toCharArray()){
            alphaMap[ch-'a']++;
        }
        
        for(String word : words){
            int[] tempAlphaMap = new int[26];
            for(char ch : word.toCharArray()){
                tempAlphaMap[ch-'a']++;
            }
            boolean flag = true;
            for(int i=0; i<26 ;i++){
                if(alphaMap[i] < tempAlphaMap[i]){
                    flag = false;
                    break;
                }
            }
            if(flag) cnt += word.length();
        }
        return cnt;
    }
}