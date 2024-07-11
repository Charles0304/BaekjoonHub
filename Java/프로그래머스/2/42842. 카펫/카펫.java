class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int h = 0;
        for(int i=1;i<=Math.sqrt(yellow);i++) {
        	if(yellow%i==0) {
        		h=yellow/i;
        		if(i*2+h*2+4==brown) {
        			answer[1]=i+2;
        			answer[0]=h+2;
        			break;
        		}
        	}
        }
        return answer;
    }
}