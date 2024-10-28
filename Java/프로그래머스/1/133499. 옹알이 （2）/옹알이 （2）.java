class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] strs = {"aya","ye","woo","ma"};
        String prev="";
        boolean isChanged=false;
        for(int j=0;j<babbling.length;j++){
            prev="";
            while(babbling[j].length()>=0){
                isChanged=false;
                for(int i=0;i<4;i++){
                    if(babbling[j].length()>=strs[i].length())
                        if(babbling[j].substring(0,strs[i].length()).equals(strs[i])&&!prev.equals(strs[i])){
                            prev = strs[i];
                            babbling[j]=babbling[j].replaceFirst(strs[i],"");
                            isChanged=true;
                        }
                }
                if(!isChanged)
                    break;
            }
        }
        for(String s:babbling){
            // System.out.println(s);
            if(s.length()==0)
                answer++;
        }
        return answer;
    }
}