import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        List<Node> list = new ArrayList<>();
        for(int i=0; i<mat.length ;i++){
            int sum = 0;
            for(int j=0; j<mat[i].length ;j++){
                sum += mat[i][j];
            }
            list.add(new Node(i, sum));
        }
        
        Collections.sort(list);
        
        int[] answer = new int[k];
        for(int i=0; i<k && i<list.size() ;i++){
            answer[i] = Integer.valueOf(list.get(i).idx);
        }
        
        return answer;
    }
}


class Node implements Comparable<Node>{
    public int idx;
    public int sum;
    
    Node(int idx, int sum){
        this.idx = idx;
        this.sum = sum;
    }
    
    public int compareTo(Node n){
        if(this.sum < n.sum){
            return -1;
        }else if(this.sum == n.sum){
            return this.idx-n.idx;
        }else {
            return 1;
        }
    }
}