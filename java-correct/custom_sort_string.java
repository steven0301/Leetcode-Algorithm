import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String customSortString(String S, String T) {
        
        List<Node> list = new ArrayList<>();
        
        for(int i=0; i<T.length() ;i++){
            char ch = T.charAt(i);
            int index = S.indexOf(ch);
            if(index != -1){
                list.add(new Node(ch, index));
            }else {
                list.add(new Node(ch, i));
            }
        }
        
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for(Node n : list){
            sb.append(n.ch);
        }
        
        return sb.toString();
    }
}

class Node implements Comparable<Node>{
    public char ch;
    public int idx;
    
    Node(char ch, int idx){
        this.ch = ch;
        this.idx = idx;
    }
    
    public int compareTo(Node n){
        if(this.idx < n.idx) return -1;
        else return 1;
    }
}