import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isPathCrossing(String path) {
        int x = 0;
        int y = 0;
        Set<Node> set = new HashSet<>();
        set.add(new Node(x, y));        
        
        for(char ch : path.toCharArray()){
            Node tempNode = null;
            switch(ch){
                case 'N':
                    tempNode = new Node(x, ++y);
                    if(set.contains(tempNode)) return true;
                    else set.add(tempNode);
                    break;
                case 'S':
                    tempNode = new Node(x, --y);
                    if(set.contains(tempNode)) return true;
                    else set.add(tempNode);
                    break;
                case 'E':
                    tempNode = new Node(++x, y);
                    if(set.contains(tempNode)) return true;
                    else set.add(tempNode);
                    break;
                case 'W':
                    tempNode = new Node(--x, y);
                    if(set.contains(tempNode)) return true;
                    else set.add(tempNode);
                    break;
            }
            
        }
        
        return false;
    }
}

class Node {
    public int x;
    public int y;
    
    Node(int x, int y){
        this.x = x;
        this.y = y;
    }

    // 중요 : set.contains()를 사용하기 위해서는 hashCode도 재정의 내려져야 한다.
    public boolean equals(Object obj) {
		if (!(obj instanceof Node))
			return false;
		if (obj == this)
			return true;
        if(this.x ==((Node) obj).x && this.y == ((Node) obj).y) return true;
        return false;
	}
    
    public int hashCode(){
		return x + y;
	}
}