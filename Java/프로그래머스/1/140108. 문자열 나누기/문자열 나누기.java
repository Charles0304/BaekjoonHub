class Solution {
    public static int cutString(String s){
        int x=1,y=0;
        char c=s.charAt(0);
        int idx=0;
        if(s.length()==1||s.length()==0)
            return s.length();
        for(int i=1;i<s.length();i++){
            
            if(x==y){
                break;
            }
            if(c==s.charAt(i))
                x++;
            else
                y++;
            idx=i+1;
            
        }
        if(idx>=s.length())
            return 1;
        return 1+cutString(s.substring(idx));
    }
    public int solution(String s) {
        int answer = 0;
        return cutString(s);
    }
}