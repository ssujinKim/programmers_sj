class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int tmp, len = numbers.length;
        
        for(int i = 0; i < len-1; i++) {
            for(int j = i+1; j < len; j++) {
                if(numbers[i] > numbers[j]) {
                    tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
        
        answer = (numbers[len-1]*numbers[len-2] > numbers[0]*numbers[1] ? 
                  numbers[len-1]*numbers[len-2] : numbers[0]*numbers[1]);
        
        return answer;
    }
}