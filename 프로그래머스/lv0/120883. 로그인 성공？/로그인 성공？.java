class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        boolean b = false;
        
        for(int i = 0; i < db.length; i++) {
            if(id_pw[0].equals(db[i][0]) && id_pw[1].equals(db[i][1]))
                answer = "login";
        }

        if(answer.equals("")) {
            for(int i = 0; i < db.length; i++) {
                if(id_pw[0].equals(db[i][0])) answer = "wrong pw";
            }
        }
        
        if(answer.equals("")) answer = "fail";
        
        return answer;
    }
}