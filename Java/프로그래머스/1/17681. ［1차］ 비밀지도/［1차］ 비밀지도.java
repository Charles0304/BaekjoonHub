class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        
        for(int i=0;i<n;i++){
            String s = "";
            for(int j=0;j<n;j++){
                if(arr1[i]%2==1||arr2[i]%2==1)
                    s='#'+s;
                else
                    s=' '+s;
                arr1[i]=arr1[i]/2;
                arr2[i]=arr2[i]/2;
            }
            answer[i] = s;
        }
        return answer;
    }
}