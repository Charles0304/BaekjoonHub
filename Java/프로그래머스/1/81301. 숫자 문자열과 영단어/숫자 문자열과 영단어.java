class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] wordToNumber = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i=0;i<10;i++){
            s=s.replaceAll(wordToNumber[i],String.valueOf(i));
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}