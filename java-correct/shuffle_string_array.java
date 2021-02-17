class Solution {
    public String restoreString(String s, int[] indices) {
        char[] cs = new char[s.length()];
        for (int i=0; i<cs.length; i++) {
            // 포인트 : index에 해당되는 곳에 value를 넣는다.
            cs[indices[i]] = s.charAt(i);
        }
        return String.valueOf(cs);
    }
}