class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];
        int index = 0, i = 0;
        for(int num : numbers) {
            if(index >= num1 && index <= num2) {
                answer[i++] = num;
            }
            index++;
        }
        return answer;
    }
}