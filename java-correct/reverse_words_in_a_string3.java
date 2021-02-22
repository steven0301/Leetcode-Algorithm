class Solution {
    public String reverseWords(String s) {
        
        StringBuilder answer = new StringBuilder();
        String[] arr = s.split(" ");
        for(int i=0; i<arr.length ;i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<arr[i].length() ;j++){
                sb.append(arr[i].charAt(j));
            }
            answer.append(sb.reverse() + " ");

            // 중요 : 아래와 같이 말고 trim을 통해서 문자열 양 끝의 빈 문자를 제거할 수도 있다.
            // if(i != arr.length-1) answer.append(' ');
        }
        
        return answer.toString().trim();
    }
}