class Solution {
    int sum;
    public int sumOddLengthSubarrays(int[] arr) {
        boolean[] visited = new boolean[arr.length+1];
        for(int r=1; r<arr.length; r+=2){
            combination(arr, visited, 0, arr.length, r);
        }
        return sum;
    }
    
    public void combination(int[] arr, boolean[] visited, int start, int n, int r) {
        if(r == 0) {
            addAll(arr, visited, n);
            return;
        } 
    
        for(int i=start; i<n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }
    
    public void addAll(int[] arr, boolean[] visited, int n){
        for(int i=0; i<n; i++){
            if(visited[i]) sum += arr[i];
        }
    }
}