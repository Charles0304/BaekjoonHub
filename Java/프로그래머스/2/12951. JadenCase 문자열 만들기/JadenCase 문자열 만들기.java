class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        char prev = 'a';
        if(Character.isLetter(arr[0]))
            arr[0] = Character.toUpperCase(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(prev==' ')
                arr[i]=Character.toUpperCase(arr[i]);
            else
                arr[i] = Character.toLowerCase(arr[i]);
            prev = arr[i];
        }
        String answer = new String(arr);
        return answer;
    }
}