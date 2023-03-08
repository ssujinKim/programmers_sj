class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int b1 = b/gcd(a, b);
        boolean check = true;
        
        for(int i = 2; i <= b1; i++) {
            while(b1%i == 0) {
                b1 /= i;
                if(!(i%2 == 0 || i%5 == 0)) {
                    check = false;
                    break;
                }
            }
        }
        
        if(check) answer = 1;
        else answer = 2;
        
        return answer;
    }
    
    private int gcd(int a, int b) {
        if(b == 0)
            return a;
        else
            return gcd(b, a%b);
    }
}