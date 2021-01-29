import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public String[] findWords(String[] words) {
        
        List<String> answerList = new ArrayList<>();
        
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        Set<Character> set3 = new HashSet<>();
        
        set1.add('q'); set1.add('w'); set1.add('e'); set1.add('r'); set1.add('o');
        set1.add('t'); set1.add('y'); set1.add('u'); set1.add('i'); set1.add('p');
        
        set2.add('a'); set2.add('s'); set2.add('d'); set2.add('f'); set2.add('g');
        set2.add('h'); set2.add('j'); set2.add('k'); set2.add('l');
        
        set3.add('z'); set3.add('x'); set3.add('c'); set3.add('v'); set3.add('b');
        set3.add('n'); set3.add('m');
        
        for(int i=0; i<words.length ;i++){
            int cnt1 = 0;
            int cnt2 = 0;
            int cnt3 = 0;
            char[] arr = words[i].toCharArray();
            for(int j=0; j<arr.length ;j++){
                if(set1.contains(Character.toLowerCase(arr[j]))) cnt1++;
                else if(set2.contains(Character.toLowerCase(arr[j]))) cnt2++;
                else if(set3.contains(Character.toLowerCase(arr[j]))) cnt3++;
            }
                        
            if(cnt1 == words[i].length() || cnt2 == words[i].length() || cnt3 == words[i].length())
                answerList.add(words[i]);
        }
        
        String[] answer = new String[answerList.size()];
        for(int i=0; i<answerList.size() ;i++){
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}