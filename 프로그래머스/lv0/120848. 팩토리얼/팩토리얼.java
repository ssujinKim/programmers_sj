class Solution {
    public int solution(int n) {
        int answer = 0, i = 1;
        
        while(true) {
            if(fact(i) == n) {
                answer = i;
                break;
            }
            else if(fact(i) > n) {
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
    
    public int fact(int n) {
        if(n == 1) return 1;
        return fact(n-1) * n;
    }
}

/*
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
*/