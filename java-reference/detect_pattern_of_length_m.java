class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        
        // String으로 변환해서 풀려고 했으나 아래와 같은 반례가 존재
        // [99, 9]
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length ;i++){
            sb.append(arr[i]);
        }
        
        int max = 0;
        String str = sb.toString();
        String prev = null;
        for(int i=0; i<str.length()-m; i++){
            int cnt = 0;
            prev = str.substring(i,i+m);
            for(int j=i; j<str.length(); j += m){
                if(j+m>str.length()-1 && m != 1){
                    break;
                }
                String temp = str.substring(j, j+m);
                // System.out.println(String.format("i : %d, j : %d , str.substring(%d, %d) : %s , prev : %s", i, j, j, j+m, str.substring(j, j+m), prev));
                if(prev.equals(temp)){
                    cnt++;
                }else {
                    break;
                }
            }
            if(max < cnt) max = cnt;
        }
        // System.out.println(String.format("max : %d, k : %d", max, k));
        return max >= k;
    }
}