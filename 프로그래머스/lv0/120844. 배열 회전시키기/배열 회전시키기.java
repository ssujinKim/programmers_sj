class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int i;
        
        if(direction.equals("right")) {
            for(i = 0; i < numbers.length-1; i++) {
                answer[i+1] = numbers[i];
            }
            answer[0] = numbers[i];
        }
        else {
            for(i = 1; i < numbers.length; i++) {
                answer[i-1] = numbers[i];
            }
            answer[i-1] = numbers[0];
        }
        
        return answer;
    }
}