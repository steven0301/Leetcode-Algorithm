class Solution {
    public char findKthBit(int n, int k) {
        // d[n] = d[n-1] + "1" + reverseAndInvert(d[n-1]);
        String temp = "0";
        for(int i=0; i<n-1 ;i++){
            StringBuilder sb = new StringBuilder();
            sb.append(temp).append("1").append(reverseAndInvert(temp));
            temp = sb.toString();
        }

        return temp.charAt(k-1);
    }
    
    public String reverseAndInvert(String word){
        StringBuilder sb = new StringBuilder();
        for(char ch : word.toCharArray()){
            if(ch == '0') sb.append(1);
            else sb.append(0);
        }
        return sb.reverse().toString();
    }
}