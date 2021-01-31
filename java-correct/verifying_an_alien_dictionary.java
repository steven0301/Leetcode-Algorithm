class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        for(int i=0; i<words.length-1 ;i++){
            if(!compare(words[i], words[i+1], order)) return false;
        }
        return true;
    }
    
    public boolean compare(String s1, String s2, String order){
        int l1 = s1.length();
        int l2 = s2.length();
        // 중요 : 동시에 i, j를 카운트
        for(int i=0, j=0; i<l1 && j<l2 ;i++,j++){
            if(s1.charAt(i) != s2.charAt(j)){
                if(order.indexOf(s1.charAt(i)) > order.indexOf(s2.charAt(j))) return false;
                else return true;   
            }
        }
        if(l1>l2) return false;
        
        return true;
    }
}