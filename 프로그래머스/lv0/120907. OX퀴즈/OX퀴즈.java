class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        String[] str;
        int n1, n2, n3, k;
        
        for(int i = 0; i < quiz.length; i++) {
            str = quiz[i].split(" ");
            n1 = Integer.parseInt(str[0]);
            n2 = Integer.parseInt(str[2]);
            
            switch(str[1]) {
                case "+": k = n1 + n2; break;
                default: k = n1 - n2;
            }
            
            n3 = Integer.parseInt(str[4]);
            if(k == n3) answer[i] = "O";
            else answer[i] = "X";
        }
        
        return answer;
    }
}