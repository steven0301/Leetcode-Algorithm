import java.util.ArrayList;
import java.util.List;

class Solution {
    boolean[] visited;
    List<List<Integer>> answerList;
    public List<List<Integer>> subsets(int[] nums) {
        answerList = new ArrayList<>();
        answerList.add(new ArrayList<Integer>());
        int n = nums.length;
        visited = new boolean[n+1];
        for(int r=1; r<=n; r++){
            combination(nums, visited, 0, n, r);
        }
        return answerList;
    }
    
    public void combination(int[] nums, boolean[] visited, int start, int n, int r) {
        if(r == 0) {
            answerList.add(getList(nums, n));
            return;
        } 
        for(int i=start; i<n; i++) {
            visited[i] = true;
            combination(nums, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }
    
    public List<Integer> getList(int[] nums, int n){
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(visited[i]) list.add(nums[i]);
        }
        return list;
    }
}