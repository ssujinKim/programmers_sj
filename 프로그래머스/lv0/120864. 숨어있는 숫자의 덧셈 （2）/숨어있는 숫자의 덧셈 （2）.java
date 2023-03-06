class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String num = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if(!(c >= 'a' && c <= 'z') && !(c >= 'A' && c <= 'Z')) {
                num += c;
            } else {
                if(!num.equals("")) answer += Integer.parseInt(num);
                num = "";
            }
        }
        if(!num.equals("")) answer += Integer.parseInt(num);
        
        return answer;
    }
}