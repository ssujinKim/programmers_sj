class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int size = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) size++;
        }
        answer = new int[size];
        size = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) answer[size++] = i;
        }
        return answer;
    }
}