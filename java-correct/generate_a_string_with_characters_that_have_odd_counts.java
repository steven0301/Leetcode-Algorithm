class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder("a");
        for(int i=1; i<n; i++){
            if(n%2 == 0) sb.append("b");
            else sb.append("a");
        }
        return sb.toString();
    }
}