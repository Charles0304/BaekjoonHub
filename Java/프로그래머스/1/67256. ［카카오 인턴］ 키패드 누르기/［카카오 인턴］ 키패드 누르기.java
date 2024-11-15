class Solution {
    public static int getDistance(int x1,int y1, int x2,int y2){
        return Math.abs(x1-x2)+Math.abs(y1-y2);
    }
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int ly = 3,ry=3,lx=0,rx=2;
        for(int n:numbers){
            if(n==0)
                n+=11;
            if(n%3==1){//왼손
                ly = n/3;
                lx = 0;
                answer=answer+"L";
            }
            else if(n%3==0){//오른손
                ry = n/3-1;
                rx = 2;
                answer=answer+"R";
            }else{//가운데
                if(getDistance(rx,ry,1,n/3)<getDistance(lx,ly,1,n/3)){//오른손 가깝
                    rx=1;
                    ry=n/3;
                    answer=answer+"R";
                }else if(getDistance(rx,ry,1,n/3)>getDistance(lx,ly,1,n/3)){//왼손 가깝
                    lx=1;
                    ly=n/3;
                    answer=answer+"L";
                }else{//같을 때
                    if(hand.equals("right")){
                        rx=1;
                        ry=n/3;
                        answer=answer+"R";
                    }else{
                        lx=1;
                        ly=n/3;
                        answer=answer+"L";
                    }
                }
            }
        }
        return answer;
    }
}