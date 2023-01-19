class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int a = numer1*denom2 + numer2*denom1;
        int b = denom1*denom2;
        
        answer[0] = a / gcd(a, b);
        answer[1] = b / gcd(a, b);
        return answer;
    }
    
    public int gcd(int a, int b) {
        int tmp, n;
        if(a < b) {
            tmp = a;
            a = b;
            b = tmp;
        }
        while(b != 0) {
            n = a % b;
            a = b;
            b = n;
        }
        return a;
        
        // if(b == 0) return a;
        // else return gcd(b, a%b);
        
    }
}