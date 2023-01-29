class Solution {
    public int[] solution(String my_string) {
        int size = 0;
        for(int i = 0; i < my_string.length(); i++) {
            if(!(my_string.charAt(i) >= 'a' && my_string.charAt(i) <= 'z'))
                size++;
        }
        
        int[] answer = new int[size];
        int idx = 0;
        for(int i = 0; i < my_string.length(); i++) {
            if(!(my_string.charAt(i) >= 'a' && my_string.charAt(i) <= 'z'))
                answer[idx++] = my_string.charAt(i) - '0';
        }
        
        for(int i = 0; i < answer.length-1; i++) {
            for(int j = i+1; j < answer.length; j++) {
                if(answer[i] > answer[j]) {
                    int tmp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = tmp;
                }
            }
        }
        
        return answer;
    }
}