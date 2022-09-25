class Solution {
    public String solution(String s) {
        
        String answer = "";

        String[] arr = s.toLowerCase().split("");

        boolean isFirstChar = true;

        for (String s1 : arr) {
            answer += isFirstChar ? s1.toUpperCase() : s1;
            isFirstChar = " ".equals(s1) ? true : false;
        }
        
        return answer;
    }
}