import java.math.BigInteger;

class Solution {
    public int solution(int n) {
        int answer = 0, i = 1;
        BigInteger f = BigInteger.valueOf(n);
        
        while(true) {
            if(factorial(i).compareTo(f) == 0) {
                answer = i;
                break;
            }
            else if(factorial(i).compareTo(f) == 1) {
                answer = i-1;
                break;
            }
            else {
                i++;
                continue;
            }
        }
        
        return answer;
    }
    
    public BigInteger factorial(int i) {
        if(i <= 1) return BigInteger.valueOf(1);
        BigInteger big_i = BigInteger.valueOf(i);
        return factorial(i-1).multiply(big_i);
    }
}