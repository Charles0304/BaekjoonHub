class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(char c:s.toCharArray()){
            if(c!=' '){
                if(c<='Z'&&c>='A')
                    c=(char)('A'+(c+n-'A')%26);
                else if(c<='z'&&c>='a')
                    c=(char)('a'+(c+n-'a')%26);
            }
            
            answer+=c;
        }
        return answer;
    }
}