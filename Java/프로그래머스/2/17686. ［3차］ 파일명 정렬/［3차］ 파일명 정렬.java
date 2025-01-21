import java.util.*;
class Solution {
    public String[] solution(String[] files) {
        String[] answer = {};
        Arrays.sort(files,(a,b)->{
            int s=0,e=a.length();
            boolean isNum = false;
            for(int i=0;i<a.length();i++){
                if(!isNum&&Character.isDigit(a.charAt(i))){
                    s=i;
                    isNum=true;
                }
                if(isNum&&!Character.isDigit(a.charAt(i))){
                    e=i;
                    isNum=false;
                    break;
                }
            }
            
            String aHead=a.substring(0,s).toUpperCase();
            int aNum=Integer.valueOf(a.substring(s,e));
            
            s=0;
            e=b.length();
            isNum=false;
            
            for(int i=0;i<b.length();i++){
                if(!isNum&&Character.isDigit(b.charAt(i))){
                    s=i;
                    isNum=true;
                }
                if(isNum&&!Character.isDigit(b.charAt(i))){
                    e=i;
                    isNum=false;
                    break;
                }
            }
            String bHead=b.substring(0,s).toUpperCase();
            int bNum=Integer.valueOf(b.substring(s,e));
            System.out.println(String.format("%s %d %s %d",aHead,aNum,bHead,bNum));
            int ret = aHead.compareTo(bHead);
            if(ret==0){
                if(aNum>bNum)
                    return 1;
                else if(aNum<bNum)
                    return -1;
                else return 0;
            }
            return ret;
        });
        return files;
    }
}