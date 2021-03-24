class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] answer = new int[image.length][image[0].length];
        for(int i=0; i<image.length; i++){
            int[] arr = image[i];
            arr = reverse(arr);
            arr = invert(arr);
            answer[i] = arr;
        }
        return answer;
    }
    
    public int[] reverse(int[] arr){
        int[] answer = new int[arr.length];
        for(int i=0; i<arr.length ;i++){
            answer[i] = arr[arr.length-1-i];
        }
        return answer;
    }
    
    public int[] invert(int[] arr){
        int[] answer = new int[arr.length];
        for(int i=0; i<arr.length ;i++){
            answer[i] = (arr[i] == 0 ? 1:0);
        }
        return answer;
    }
}