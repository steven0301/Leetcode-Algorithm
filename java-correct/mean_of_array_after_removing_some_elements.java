class Solution {
    public double trimMean(int[] arr) {
        double sum = 0;
        Arrays.sort(arr);
        int part = (int)(arr.length * 0.05);
        for(int i=part; i<arr.length-part; i++)
            sum += arr[i];
        return sum/(arr.length-2*part);
    }
}