class Solution {
    public int maxRepeating(String sequence, String word) {
        int i = sequence.indexOf(word);
        int max = 0;
        while (i > -1) {
            int cnt = 1;
            int j = i + word.length();
            while (sequence.startsWith(word, j)) {
                cnt++;
                j += word.length();
            }
            if (cnt > max) max = cnt;
            i = sequence.indexOf(word, j);
        }
        return max;
    }
}