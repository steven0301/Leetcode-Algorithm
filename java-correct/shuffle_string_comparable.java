import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String restoreString(String s, int[] indices) {
        List<Node> list = new ArrayList<>();
        for(int i=0; i<indices.length ;i++){
            list.add(new Node(s.charAt(i), indices[i]));
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