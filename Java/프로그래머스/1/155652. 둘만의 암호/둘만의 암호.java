class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        for(int i = 0;i<s.length();i++) {
			int c = s.charAt(i);
			for(int j=0;j<index;) {
				c=97+((c-97+1)%26);
				while(skip.contains(String.valueOf((char)c))) {
					c=97+((c-97+1)%26);
				}
				j++;
			}
			answer+=(char)c;
		}
        
        return answer;
    }
}