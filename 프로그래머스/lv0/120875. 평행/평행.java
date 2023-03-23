class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        double m, n;
        
        m = (double)(dots[0][1]-dots[1][1])/(double)(dots[0][0]-dots[1][0]);
        n = (double)(dots[2][1]-dots[3][1])/(double)(dots[2][0]-dots[3][0]);
        if(m == n) answer++;
        
        m = (double)(dots[0][1]-dots[2][1])/(double)(dots[0][0]-dots[2][0]);
        n = (double)(dots[1][1]-dots[3][1])/(double)(dots[1][0]-dots[3][0]);
        if(m == n) answer++;
        
        m = (double)(dots[0][1]-dots[3][1])/(double)(dots[0][0]-dots[3][0]);
        n = (double)(dots[1][1]-dots[2][1])/(double)(dots[1][0]-dots[2][0]);
        if(m == n) answer++;
        
        answer = (answer >= 1 ? 1 : 0);
        
        return answer;
    }
}