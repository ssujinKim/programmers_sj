class Solution {
    public String solution(int age) {
        String answer = "";
        String a = age + "";
        int[] arr = new int[a.length()];
        
        for(int i = 0; i < a.length(); i++)
            arr[i] = a.charAt(i) - '0';
        for(int i = 0; i < arr.length; i++)
            answer += (char)(97 + arr[i]);
        
        return answer;
    }
}