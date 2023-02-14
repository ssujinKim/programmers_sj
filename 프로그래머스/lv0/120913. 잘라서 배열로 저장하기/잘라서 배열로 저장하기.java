class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(my_str.length()%n == 0 ? my_str.length()/n : my_str.length()/n + 1)];
        int i = 0, index = 0;
        
        while(true) {
            if(index < answer.length-1){
                answer[index++] = my_str.substring(i, i+n);
            } else {
                answer[index++] = my_str.substring(i, my_str.length());
                break;
            }
            i += n;
        }
        
        return answer;
    }
}