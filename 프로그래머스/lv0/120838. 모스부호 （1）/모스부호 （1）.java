class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = { 
            ".-","a","-...","b","-.-.","c","-..","d",".","e","..-.","f",
            "--.","g","....","h","..","i",".---","j","-.-","k",".-..","l",
            "--","m","-.","n","---","o",".--.","p","--.-","q",".-.","r",
            "...","s","-","t","..-","u","...-","v",".--","w","-..-","x",
            "-.--","y","--..","z" };
        String[] letter2 = letter.split(" ");
        
        for(int i = 0; i < letter2.length; i++) {
            for(int j = 0; j < morse.length; j++) {
                if(letter2[i].equals(morse[j]))
                    answer += morse[j+1];
            }
        }
        
        return answer;
    }
}