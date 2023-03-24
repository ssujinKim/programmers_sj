class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] arr = new int[201];
        
        for(int[] line : lines) {
            int a = line[0] + 100;
            int b = line[1] + 100;
            for(int j = a; j < b; j++) {
                arr[j]++;
            }
        }
        
        for(int ar : arr) {
            if(ar > 1) answer++;
        }
        
        return answer;
    }
}