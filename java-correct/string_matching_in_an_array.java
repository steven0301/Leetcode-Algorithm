class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> answerSet = new HashSet<>();
        for(int i=0; i<words.length ;i++){
            for(int j=0; j<words.length ;j++){
                if(i == j) continue;
                if(words[i].indexOf(words[j]) != -1) answerSet.add(words[j]);
            }
        }
        List<String> answerList = new ArrayList(answerSet);
        return answerList;
    }
}