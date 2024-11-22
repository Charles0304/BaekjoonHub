class Solution {
    public int[] solution(String s) {
        
        int n = 0;
        int m = 0;
        int len = s.length();
        while(!s.equals("1")){
            s=s.replaceAll("0","");
            m+=len-s.length();
            s=Integer.toBinaryString(s.length());
            len=s.length();
            n++;
        }
        return new int[]{n,m};
    }
}