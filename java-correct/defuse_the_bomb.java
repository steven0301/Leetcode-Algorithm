class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] answer = new int[code.length];
        int len = code.length;
        for(int i=0; i<code.length; i++){
            int sum = 0;
            if(k > 0){
                for(int j=1; j<=k ;j++){
                    sum += code[(i+j)%len];
                }
                answer[i] = sum;
            }else if(k < 0){
                for(int j=-1; j>= k ;j--){
                    int a = i + j;
                    if(a < 0) a = code.length+a;
                    sum += code[a%len];
                }
                answer[i] = sum;
            }else {
                answer[i] = 0;
            }
        }
        
        return answer;
    }
}