class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        
        String[] words = sentence.split(" ");
        for(int i=0; i<words.length ;i++){
            String word = words[i];

            // word.indexOf(searchWord)==0 역시 가능하다.
            if(word.startsWith(searchWord)) return i+1;
        }
        
        return -1;
    }
}