class Solution {
    public int findNumbers(int[] nums) {
        int cnt = 0;
        for(int e : nums){
            int len = String.valueOf(e).length();
            if(len%2 == 0) cnt++;
        }
        return cnt;
    }
}