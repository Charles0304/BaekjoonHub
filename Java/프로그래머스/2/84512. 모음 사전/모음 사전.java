class Solution {
    static String[] strs = {"A","E","I","O","U"};
    static boolean found = false;
    public static int makeString(String s,int n,String word){
            if(found)
                return n;
            n++;
            if(s.equals(word)){
                found=true;
                return n;
            }
            if(s.length()<5)
                for(String str:strs)
                    n = makeString(s+str,n,word);
            return n;
        }
    public int solution(String word) {
        int answer = 0;
        found = false;
        for(String str:strs){
            answer = makeString(str,answer,word);
        }
        
        return answer;
    }
}