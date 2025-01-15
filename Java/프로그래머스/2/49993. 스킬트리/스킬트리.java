class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        int i=0;
        int j=0;
        boolean isPossible = true;
        for(String st:skill_trees){
            i=0;
            j=0;
            isPossible=true;
            while(i<skill.length()&&j<st.length()&&isPossible){
                if(skill.charAt(i)==st.charAt(j)){
                    i++;
                    j++;
                    continue;
                }
                if(skill.contains(String.valueOf(st.charAt(j)))){
                    isPossible=false;
                }
                j++;
            }
            if(isPossible)
                answer++;
        }
        return answer;
    }
}