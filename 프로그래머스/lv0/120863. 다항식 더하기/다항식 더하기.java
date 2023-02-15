class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] arr = polynomial.split(" ");
        int x = 0, s = 0;
        
        for(String p : arr) {
            if(p.equals("x"))
                x += 1;
            else if(p.contains("x")) {
                try {
                    x += Integer.parseInt(p.replace("x", ""));
                } catch(NumberFormatException e) {
                    
                } catch(Exception e) {
                    
                }
            }
            else if(!p.equals("+")) {
                try {
                    s += Integer.parseInt(p);
                } catch(NumberFormatException e) {
                    
                } catch(Exception e) {
                    
                }
            }
            else continue;
        }
        
        if(x != 0 && s != 0) {
            if(x == 1)
                answer += "x + " + s;
            else
                answer += x + "x + " + s;
        }
        if(x != 0 && s == 0) {
            if(x == 1)
                answer += "x";
            else
                answer += x + "x";
        }
        if(x == 0 && s != 0) answer += s;
        if(x == 0 && s == 0) answer += 0;
        
        return answer;
    }
}