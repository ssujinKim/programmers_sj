class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int w = 0, h = 0;
        
        for(int i = 1; i <= 3; i++) {
            if(dots[0][0] == dots[i][0]) {
                h = Math.abs(dots[0][1]-dots[i][1]);
                break;
            }
        }
        for(int i = 1; i <= 3; i++) {
            if(dots[0][1] == dots[i][1]) {
                w = Math.abs(dots[0][0]-dots[i][0]);
                break;
            }
        }
        
        answer = w * h;
        return answer;
    }
}