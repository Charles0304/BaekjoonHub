class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int time = 0;
        int atime=0;
        int cnt=0;
        int hp=health;
        while(atime<attacks.length){
            if(time==attacks[atime][0]) {//공격
            	hp-=attacks[atime++][1];
            	if(hp<=0)
            		return -1;
            	cnt=0;
                time++;
            	continue;
            }
            hp=(hp+bandage[1]);//회복
            cnt++;
            time++;
            if(cnt==bandage[0]) {
            	hp=(hp+bandage[2]);
            	cnt=0;
            }
            if(hp>health)
            	hp=health;
        }
        
        return hp;
    }
}