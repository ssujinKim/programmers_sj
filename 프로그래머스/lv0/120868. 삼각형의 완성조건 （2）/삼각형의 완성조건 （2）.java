class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int m = 1, l, s;
        
        if(sides[0] > sides[1]) {
            l = sides[0]; s = sides[1];
        } else {
            l = sides[1]; s = sides[0];
        }
        
        while(true) {
            if(m > l) break;
            if(l < s + m) answer += 1;
            m++;
        }
        
        int tmp = m;
        m = l;
        l = tmp;
        
        while(true) {
            if(l < s + m) answer += 1;
            else break;
            l++;
        }
        
        return answer;
    }
}