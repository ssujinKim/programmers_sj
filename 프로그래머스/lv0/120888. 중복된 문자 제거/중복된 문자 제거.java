class Solution {
    public String solution(String my_string) {
        String answer = "";
//         int cnt;
        
//         for(int i = 0; i < my_string.length(); i++) {
//             cnt = 0;
//             for(int j = 0; j < answer.length(); j++) {
//                 if(my_string.charAt(i) == answer.charAt(j)) cnt++;
//             }
//             if(cnt == 0) answer += my_string.charAt(i);
//         }
        
        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.indexOf(my_string.charAt(i)) == i)
                answer += my_string.charAt(i);
        }
        
        return answer;
    }
}