class Solution {
    public int[] solution(int n, int[] numlist) {
        int size = 0, i;
        
        for(i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0)
                size++;
        }
        
        int[] answer = new int[size];
        size = 0;
        
        for(i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0)
                answer[size++] = numlist[i];
        }
        
        return answer;
    }
}