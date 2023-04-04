class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int[] arr = new int[numlist.length];
        
        for(int i = 0; i < arr.length; i++) {
            answer[i] = numlist[i];
            arr[i] = Math.abs(numlist[i]-n);
        }
        
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int tmp1 = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp1;
                    
                    int tmp2 = answer[i];
                    answer[i] = answer[j];
                    answer[j] = tmp2;
                }
            }
        }
        
        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i] == arr[i+1]) {
                if(answer[i] < answer[i+1]) {
                    int tmp = answer[i];
                    answer[i] = answer[i+1];
                    answer[i+1] = tmp;
                }
            }
        }
        
        return answer;
    }
}