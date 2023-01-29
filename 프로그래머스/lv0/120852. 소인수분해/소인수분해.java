class Solution {
    public int[] solution(int n) {
        int[] answer0 = new int[10];
        int i = 2, cnt, size = 0;
        
        while(n != 1) {
            if(n % i == 0) {
                cnt = 0;
                for(int j = 1; j <= i; j++) {
                    if(i % j == 0)
                        cnt++;
                }
                if(cnt == 2) {
                    if(size == 0 || answer0[size-1] != i)
                        answer0[size++] = i;
                    n /= i;
                }
            }
            else i++;
        }
        
        int[] answer = new int[size];
        for(int idx = 0; idx < size; idx++)
            answer[idx] = answer0[idx];
            
        return answer;
    }
}