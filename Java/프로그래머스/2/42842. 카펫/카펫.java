class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        int h=0,w=0;
        for(int i=1;i<=yellow;i++){
            if(yellow%i==0){
                h=i;
                w=yellow/h;
                if(2*h+2*w+4==brown)
                    break;
            }
        }
        return new int[]{w+2,h+2};
    }
}