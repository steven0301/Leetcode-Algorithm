class Solution {
    public boolean isIsomorphic(String s, String t) {
        java.util.Map<Character, Character> map = new java.util.HashMap<Character, Character>();
        for (int i = 0; i < s.length(); i++) {
            char si = s.charAt(i);
            char ti = t.charAt(i);
            if (map.containsKey(si) && !map.get(si).equals(ti)) {
                return false;
            } else if (!map.containsKey(si) && map.containsValue(ti)) {
                return false;
            }
            map.put(si, ti);
        }
        return true;
    }
}