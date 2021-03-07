class Solution {
    public String interpret(String command) {
        // replace 사용
        String str = command.replace("()", "o").replace("(al)", "al");
        return str;
        
        // replaceAll 사용
        // return command.replaceAll("\\(\\)", "o").replaceAll("\\(al\\)", "al");
    }
}