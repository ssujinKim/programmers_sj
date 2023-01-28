class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = 0, idx = 0, max2 = 0;
        
        for(int i = 0; i < numbers.length; i++) {
            if(max < numbers[i]) {
                max = numbers[i];
                idx = i;
            }
        }
        for(int i = 0; i < numbers.length; i++) {
            if(i != idx) {
                if(max2 < numbers[i])
                    max2 = numbers[i];
            }
        }
        answer = max * max2;
        
        return answer;
    }
}