import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> printVertically(String s) {
                
        String[] arr = s.split(" ");
        int max = -1;
        for(int i=0; i<arr.length ;i++){
            int temp = arr[i].length();
            if(max < temp) max = temp;
        }
        
        List<String> list = new ArrayList<>();
        for(int i=0; i<max ;i++){
            StringBuilder sb = new StringBuilder();
            for(String str : arr){
                if(i >= str.length()) sb.append(" ");
                else sb.append(str.charAt(i));
            }
            // white space 여러개로 끝나는 부분이 있으면 제거한다.
            // ex) "  T  " -> "   T"
            list.add(sb.toString().replaceFirst("\\s+$",""));
        }
        
        return list;
    }
}