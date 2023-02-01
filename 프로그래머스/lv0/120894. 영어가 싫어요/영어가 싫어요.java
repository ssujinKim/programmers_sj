class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String str = "", answer_str = "";
        String[] arr1 = {"zero", "one", "two", "three", "four", 
                        "five", "six", "seven", "eight", "nine"};
        int[] arr2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        for(int i = 0; i < numbers.length(); i++) {
            str += numbers.charAt(i);
            for(int j = 0; j <= 9; j++) {
                if(str.equals(arr1[j])) {
                    answer_str += arr2[j] + "";
                    str = "";
                }
            }
        }
        
        answer = Long.parseLong(answer_str);
        return answer;
    }
}