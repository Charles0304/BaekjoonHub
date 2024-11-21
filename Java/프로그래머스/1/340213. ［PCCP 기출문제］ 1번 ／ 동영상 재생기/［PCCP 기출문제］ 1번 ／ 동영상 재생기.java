class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int cur = Integer.parseInt(pos.substring(0,2))*60+Integer.parseInt(pos.substring(3));
        int start = Integer.parseInt(op_start.substring(0,2))*60+Integer.parseInt(op_start.substring(3));
        int end = Integer.parseInt(op_end.substring(0,2))*60+Integer.parseInt(op_end.substring(3));
        int max = Integer.parseInt(video_len.substring(0,2))*60+Integer.parseInt(video_len.substring(3));
        if(cur<=end&&cur>=start)
                cur = end;
        for(String command:commands){
            if(command.equals("next")){
                cur = Math.min(cur+10,max);
            }else{
                cur = Math.max(cur-10,0);
            }
            if(cur<=end&&cur>=start)
                cur = end;
        }
        String answer = String.format("%02d:%02d",cur/60,cur%60);
        return answer;
    }
}