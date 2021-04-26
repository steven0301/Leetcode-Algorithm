class Solution {
    public int countNegatives(int[][] grid) {
        int cnt = 0;
        for(int[] arr : grid){
            for(int e : arr){
                if(e < 0) cnt++;
            }
        }
        return cnt;
    }
}