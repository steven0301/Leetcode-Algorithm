class Solution {
    public boolean detectCapitalUse(String word) {
        int i = 0;
        int[] arr = new int[word.length()];
        for(char ch : word.toCharArray()){
            if(ch == Character.toLowerCase(ch)) arr[i++] = 0;
            else arr[i++] = 1;
        }
        
        // Character.isUpperCase() 를 사용해도 괜찮음
        int cntZero = 0;
        int cntOne = 0;
        boolean isFirstCapital = true;
        for(i=0; i<arr.length; i++){
            if(i == 0 && arr[0] == 0) isFirstCapital = false;
            if(arr[i] == 0) cntZero++;
            else cntOne++;
        }
        
        if(cntZero == word.length()) return true;
        if(cntOne == word.length()) return true;
        if(isFirstCapital && cntZero == word.length()-1) return true;
        
        return false;
    }
}