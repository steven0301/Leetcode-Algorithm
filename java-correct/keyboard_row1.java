import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] findWords(String[] words) {
        if (words == null) {
            return null;
        }
        List<String> list = new ArrayList();
        for (String word : words) {
            if (word.toLowerCase().matches("[qwertyuiop]+|[asdfghjkl]+|[zxcvbnm]+")) {
                list.add(word);
            }
        }
        return list.toArray(new String[list.size()]);
    }
}