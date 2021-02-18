import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        String[] transformedWords = new String[words.length];

        // 배열 words의 각 word를 숫자문자열로 변경
        for(int j=0; j<words.length; j++){
            char[] arr = words[j].toCharArray();
            Map<Character, Integer> map = new HashMap<>();
            int num = 1;
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<arr.length ;i++){
                if(!map.containsKey(arr[i])){
                    map.put(arr[i], num++);
                }
                sb.append(map.get(arr[i]));
            }
            transformedWords[j] = sb.toString();
        }
            
        // pattern을 숫자로 변경
        // ex) abb -> 122
        Map<Character, Integer> map2 = new HashMap<>();
        int num2 = 1;
        StringBuilder sb2 = new StringBuilder();
        for(int i=0; i<pattern.length() ;i++){
            if(!map2.containsKey(pattern.charAt(i))){
                map2.put(pattern.charAt(i), num2++);
            }
            sb2.append(map2.get(pattern.charAt(i)));
        }
        
        String transformedPatter = sb2.toString();
        
        List<String> answerList = new ArrayList<>();
        
        for(int i=0; i<transformedWords.length ;i++){
            if(transformedPatter.equals(transformedWords[i])) answerList.add(words[i]);
        }
        
        return answerList;
    }
}