class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int idx = 0;
        
        for(int i = 1; i < k; i++) { idx+=2; }
        answer = numbers[idx%numbers.length];
        
        return answer;
    }
}