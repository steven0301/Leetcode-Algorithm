class Solution {
    public int xorOperation(int n, int start) {
        int[] arr = new int[n];
        int answer = 0;
        for(int i=0; i<n ; i++){
            arr[i] = start;
            start = arr[i] + 2;            
            answer ^= arr[i];
        }
        return answer;
    }
}