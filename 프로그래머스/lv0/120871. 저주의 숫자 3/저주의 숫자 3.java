class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 1;
        boolean check;
        
        while(true) {
            check = false;
            
            if(answer%3 == 0) {
                answer++;
            }
            
            String s = answer+"";
            if(s.contains("3")) {
                answer++;
            }
            
            if(answer%3 == 0 || s.contains("3")) {
                check = true;
                continue;
            }
            
            if(cnt == n) break;
            cnt++;
            answer++;
        }
        
        return answer;
    }
}