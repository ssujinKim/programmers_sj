import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        /*
        for(int i = 0; i < 2; i++) {
            for(int j = i+1; j < 3; j++) {
                if(sides[i] > sides[j]) {
                    int tmp = sides[i];
                    sides[i] = sides[j];
                    sides[j] = tmp;
                }
            }
        }
        
        if(sides[2] < sides[0]+sides[1]) answer = 1;
        else answer = 2;
        */
        
        Arrays.sort(sides);
        answer = (sides[2] < sides[0]+sides[1] ? 1 : 2);
        
        return answer;
    }
}