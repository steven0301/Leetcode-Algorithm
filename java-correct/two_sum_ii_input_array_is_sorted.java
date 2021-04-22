class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        Arrays.sort(numbers);
        while(left<right){
            int sum = numbers[left] + numbers[right];
            if(sum > target) right--;
            else if(sum < target)left++;
            else break;
        }
        int[] answerArr = new int[2];
        answerArr[0] = left+1;
        answerArr[1] = right+1;
        return answerArr;
    }
}