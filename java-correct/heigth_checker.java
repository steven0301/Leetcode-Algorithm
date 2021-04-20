class Solution {
    public int heightChecker(int[] heights) {
        int cnt = 0;
        List<Integer> list = new ArrayList<>();
        for(int e : heights)
            list.add(e);
        Collections.sort(list);
        for(int i=0; i<list.size() ;i++){
            if(list.get(i) != heights[i]) cnt++;
        }
        return cnt;
    }
}