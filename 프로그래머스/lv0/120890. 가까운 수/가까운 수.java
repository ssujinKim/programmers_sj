import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int[] a = new int[array.length];
        
        for(int i = 0; i < array.length; i++)
            a[i] = Math.abs(array[i]-n);
        
        int min = 0;
        for(int i = 1; i < a.length; i++) {
            if(a[min] > a[i])
                min = i;
        }
        answer = array[min];
        
        for(int i = 0; i < a.length; i++) {
            if(i != min && a[min] == a[i]) {
                if(array[min] > array[i])
                    answer = array[i];
            }
        }
        
        return answer;
    }
}