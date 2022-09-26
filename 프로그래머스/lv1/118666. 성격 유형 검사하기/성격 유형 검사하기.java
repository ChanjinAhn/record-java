class Solution {
    public String solution(String[] survey, int[] choices) {
       String[] types = {"RT", "CF", "JM", "AN"};
        int arr[] = new int[26];
        String answer = "";
        for (int i = 0; i < survey.length; i++) {
            char a = survey[i].charAt(0);
            char b = survey[i].charAt(1);
            int value = Math.abs(choices[i] - 4);
            if (choices[i] >= 5){
                arr[b - 'A'] += value;
            } else if (choices[i] <= 3){
                arr[a - 'A'] += value;
            }
        }
        for (String type : types) {
            char a = type.charAt(0);
            char b = type.charAt(1);
            answer += arr[a - 'A'] >= arr[b - 'A'] ? a : b;
        }
        return answer;
    }
}