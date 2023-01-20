class Solution {
    public int solution(int[] array) {
        int answer = 0, i;
        
        int[] arr = new int[1000];
        for(i = 0; i < array.length; i++)
            arr[array[i]]++;
        
        int max = arr[0];
        for(i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                answer = i;
            }
        }
        
        int cnt = 0;
        for(i = 0; i < arr.length; i++)
            if(arr[i] == max) cnt++;
        if(cnt >= 2) answer = -1;
        
        return answer;
    }
}