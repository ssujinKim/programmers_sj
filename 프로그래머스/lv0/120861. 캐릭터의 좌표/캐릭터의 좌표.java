class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int w = board[0]/2, h = board[1]/2;
        
        for(String key : keyinput) {
            if(answer[0] < w && key.equals("right")) answer[0]++;
            else if(answer[0] > -w && key.equals("left")) answer[0]--;
            else if(answer[1] < h && key.equals("up")) answer[1]++;
            else if(answer[1] > -h && key.equals("down")) answer[1]--;
        }
        
        return answer;
    }
}