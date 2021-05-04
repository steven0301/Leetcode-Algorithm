class Solution {
    int[] arr;
    List<List<Integer>> list = new ArrayList<>();
    public int[] diStringMatch(String s) {
        arr = new int[s.length()+1];
        for(int i=0; i<=s.length(); i++){
            arr[i] = i;
        }
        permutation(arr, 0, arr.length, arr.length, s);
        List<Integer> answerList = list.get(0);
        int[] answer = new int[answerList.size()];
        for(int i=0; i<answerList.size() ;i++){
            answer[i] = answerList.get(i);
        }
        return answer;
    }
    
    public void permutation(int[] nums, int depth, int n, int r, String s){        
        if(depth == r){
            check(s);
            return;
        }
        for(int i=depth; i<n; i++){
            swap(nums, depth, i);
            permutation(nums, depth+1, n, r, s);
            swap(nums, depth, i);
        }
    }
    
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public boolean check(String str){
        for(int i=0; i<arr.length-1 ;i++){
            if((arr[i+1]>arr[i] && str.charAt(i)!='I') || (arr[i+1]<arr[i] && str.charAt(i)!='D')){
                return false;
            }
        }
        print();
        return true;
    }
    
    public void print(){
        List<Integer> tempList = new ArrayList<>();
        for(int e : arr){
            tempList.add(e);
        }
        list.add(tempList);
    }
}