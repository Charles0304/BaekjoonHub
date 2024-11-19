class Solution {
    public String solution(String new_id) {
        String answer = "";
        answer=new_id.toLowerCase().replaceAll("[^a-z0-9-_.]", "")
            .replaceAll("\\.{2,}",".").replaceAll("^\\.|\\.$","");
        if(answer.length()==0)
            answer = "aaa";
        if(answer.length()>=16){
            answer = answer.substring(0,15);
            answer = answer.replaceAll("\\.$","");
        }
        while(answer.length()<3)
            answer = answer+answer.substring(answer.length()-1,answer.length());
        return answer;
    }
}