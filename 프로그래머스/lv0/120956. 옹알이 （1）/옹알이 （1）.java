class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] arr = {"aya", "ye", "woo", "ma"};
        
        for(int i = 0; i < babbling.length; i++) {
            String b = babbling[i];
            
            if(b.length() == 2) {
                if(b.equals("ye") || b.equals("ma")) answer++;
            }
            if(b.length() == 3) {
                if(b.equals("aya") || b.equals("woo")) answer++;
            }
            if(b.length() > 3) {
                while(b.length() > 0) {
                    //if(b.length() < 2) break;
                    
                    if(b.length() >= 2 && (b.substring(0,2).equals("ye") || b.substring(0,2).equals("ma"))) {
                        b = b.substring(2, b.length());
                        continue;
                    } else if(b.length() >= 3 && (b.substring(0,3).equals("aya") || b.substring(0,3).equals("woo"))) {
                        b = b.substring(3, b.length());
                        continue;
                    } else {
                        break;
                    }
                }
                if(b.length() == 0) answer++;
            }
        }
        
        return answer;
    }
}