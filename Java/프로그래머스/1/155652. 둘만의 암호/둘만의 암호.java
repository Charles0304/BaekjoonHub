class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        char c=s.charAt(0);
        int j = 0;
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            j=0;
            while(j<index){
                
                c=(char) ((c == 'z') ? 'a' : c + 1);
                if(!skip.contains(String.valueOf(c))){
                    j++;
                }
                
            }
            answer=answer+c;
        }
        return answer;
    }
}