class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        
        int i = 0;
        while(i < strlist.length) {
            answer[i] = strlist[i].length();
            i++;
        }
        
        return answer;
    }
}