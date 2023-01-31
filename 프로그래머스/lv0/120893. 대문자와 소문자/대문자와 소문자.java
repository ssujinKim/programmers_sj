class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if(c >= 'A' && c <= 'Z')
                answer += Character.toLowerCase(c);
                // answer += (c+"").toLowerCase();
            if(c >= 'a' && c <= 'z')
                answer += Character.toUpperCase(c);
                // answer += (c+"").toUpperCase();
        }
        
        return answer;
    }
}