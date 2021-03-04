class Solution {
    public int countSegments(String s) {
        String trimmed = s.trim();
        if (trimmed.equals("")) {
            return 0;
        }
        return trimmed.split("\\s+").length;

        // 위의 split 예시
        String[] tokens = "".split("\s++");
        tokens.length; // 1
        tokens[0]; // ""
    }
}