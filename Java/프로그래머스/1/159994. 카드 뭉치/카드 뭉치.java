class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int i=0,j=0,k=0;
        while(k<goal.length){
            if(i!=cards1.length){
                if(goal[k].equals(cards1[i])){
                    i++;
                    k++;
                    continue;
                }
            }
            if(j!=cards2.length){
                if(goal[k].equals(cards2[j])){
                    j++;
                    k++;
                    
                    continue;
                }
            } 
            break;
                
        }
        if(k==goal.length)
            answer = "Yes";
        else
            answer = "No";
        System.out.println(k);
        return answer;
    }
}