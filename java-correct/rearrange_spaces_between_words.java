import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Solution {
    public String reorderSpaces(String text) {
        
        int cnt = 0;
        for(char ch : text.toCharArray()){
            if(ch == ' ') cnt++;
        }
        
        List<String> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(text.trim(), " ");
        while(st.hasMoreTokens()){
            list.add(st.nextToken());
        }
        
        int len = list.size();
        int n = len-1;
        
        if(n == 0){
            StringBuilder temp = new StringBuilder();
            for(int i=0; i<cnt ;i++){
                temp.append(" ");
            }
            return text.trim()+temp.toString();
        }
        
        int a = cnt/n;
        int b = cnt%n;
                
        StringBuilder spaceBuilder = new StringBuilder();
        for(int i=0; i<a ;i++){
            spaceBuilder.append(" ");
        }
        String space = spaceBuilder.toString();
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<list.size(); i++){
            sb.append(list.get(i));
            if(i != list.size()-1) sb.append(space);
        }
        
        for(int i=0; i<b ;i++){
            sb.append(" ");
        }
        
        return sb.toString();
    }
}