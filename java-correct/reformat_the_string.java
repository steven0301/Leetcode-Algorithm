import java.util.ArrayList;
import java.util.List;

class Solution {
    public String reformat(String s) {
        
        List<Character> numberList = new ArrayList<>();
        List<Character> characterList = new ArrayList<>();
        
        for(int i = 0; i<s.length() ;i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)) numberList.add(ch);
            else characterList.add(ch);
        }

        StringBuilder sb = new StringBuilder();
        if(numberList.size() - characterList.size() == 1){
            for(int i=0; i<numberList.size() ;i++){
                sb.append(numberList.get(i));
                if(i != numberList.size()-1) sb.append(characterList.get(i));
            }
        }else if(characterList.size() - numberList.size() == 1){
            for(int i=0; i<characterList.size() ;i++){
                sb.append(characterList.get(i));
                if(i != characterList.size()-1) sb.append(numberList.get(i));
            }
        }else if(characterList.size() == numberList.size()){
            for(int i=0; i<characterList.size() ;i++){
                sb.append(characterList.get(i));
                sb.append(numberList.get(i));
            }
        }else {
            return "";
        }
        
        return sb.toString();
    }
}