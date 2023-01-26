import java.math.BigInteger;

class Solution {
    public BigInteger solution(int balls, int share) {
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("1");
        BigInteger c = new BigInteger("1");
        int i;
        
        for(i = 1; i <= balls; i++)
            a = a.multiply(new BigInteger(Integer.toString(i)));
        if(share < balls) {
            for(i = 1; i <= balls-share; i++)
                b = b.multiply(new BigInteger(Integer.toString(i)));
        }
        for(i = 1; i <= share; i++)
            c = c.multiply(new BigInteger(Integer.toString(i)));
        
        return a.divide(b.multiply(c));
    }
}