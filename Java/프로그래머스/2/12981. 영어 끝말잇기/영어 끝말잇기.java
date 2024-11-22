class Solution {
    public static boolean isSame(int n,String[] strs){
        for(int i=0;i<n;i++){
            if(strs[i].equals(strs[n]))
                return true;
        }
        return false;
    }
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        for(int i=1;i<words.length;i++){
            if(words[i-1].charAt(words[i-1].length()-1)!=words[i].charAt(0)||isSame(i,words)){
                answer[0]=i%n+1;
                answer[1]=i/n+1;
                break;
            }
        }

        return answer;
    }
}