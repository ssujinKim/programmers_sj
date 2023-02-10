class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String number = num + "";
        
        for(int i = 0; i < number.length(); i++) {
            int n = number.charAt(i) - '0';
            if(n == k) {
                answer = i+1;
                break;
            }
        }
        
        return answer;
    }
}