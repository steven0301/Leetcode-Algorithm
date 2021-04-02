import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    // 아래의 방법으로도 선언 가능 : Map.of(...)
    // private Map<Character, String> letters = Map.of(
    //     '2', "abc", '3', "def", '4', "ghi", '5', "jkl", 
    //     '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz");

    Map<Integer, Character[]> map = new HashMap<>();   
    List<String> answerList = new ArrayList<>();
    
    public List<String> letterCombinations(String digits) {
        
        if(digits.length() == 0) return answerList;
        
        map.put(2, new Character[]{'a', 'b', 'c'});
        map.put(3, new Character[]{'d', 'e', 'f'});
        map.put(4, new Character[]{'g', 'h', 'i'});
        map.put(5, new Character[]{'j', 'k', 'l'});
        map.put(6, new Character[]{'m', 'n', 'o'});
        map.put(7, new Character[]{'p', 'q', 'r', 's'});
        map.put(8, new Character[]{'t', 'u', 'v'});
        map.put(9, new Character[]{'w', 'x', 'y', 'z'});
        
        bactracking(digits, 0, new StringBuilder());
        return answerList;
    }
    
    public void bactracking(String digits, int index, StringBuilder words){
        if(index == digits.length()){
            answerList.add(words.toString());
            return;
        }
        int num = Integer.parseInt(String.valueOf(digits.charAt(index)));        
        Character[] arr = map.get(num);
        for(Character ch : arr){
            words.append(ch);
            bactracking(digits, index+1, words);
            
            // backtracking!!!
            words.deleteCharAt(words.length()-1);
        }
    }
}