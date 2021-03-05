import java.util.ArrayDeque;

class Solution {
    public String makeGood(String s) {
           int distance = Math.abs('a' - 'A');
           var deque = new ArrayDeque<Character>();
           for (int i = 0; i < s.length(); i++) {
               if (!deque.isEmpty() && Math.abs(deque.peekLast() - s.charAt(i)) == distance) {
                   deque.pollLast();
               } else {
                   deque.addLast(s.charAt(i));
               }
           }
           char[] goodString = new char[deque.size()];
           for (int i = 0; i < goodString.length; i++) {
               // 중요
               goodString[i] = deque.removeFirst();
           }
           return new String(goodString);
       }
}