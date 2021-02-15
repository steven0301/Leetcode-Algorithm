class Solution {
    public boolean halvesAreAlike(String s) {
        Set<Character> set = new HashSet<>();
        set.add('a'); set.add('A');
        set.add('e'); set.add('E');
        set.add('i'); set.add('I');
        set.add('o'); set.add('O');
        set.add('u'); set.add('U');

        // String vowels = "aeiouAEIOU";
        // vowels.contains(s.charAt(i)) 도 사용 가능하다.
        
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0; i<s.length(); i++){
            if(i<s.length()/2 && set.contains(s.charAt(i))) sum1++;
            if(i>=s.length()/2 && set.contains(s.charAt(i))) sum2++;
        }
        
        return sum1==sum2? true : false;
    }
}