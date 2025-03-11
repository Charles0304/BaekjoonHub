import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        while(true){
            String input = br.readLine();
            if(input.equals("end")){
                break;
            }
            boolean hasVowels = false,isTriple = false,isDouble=false;
            char prev=input.charAt(0),now;
            int cnt = 0;
            if(vowels.contains(prev))
                hasVowels=true;

            for(int i=1;i<input.length();i++){
                now = input.charAt(i);
                if(prev==now&&prev!='e'&&prev!='o'){
                    isDouble=true;
                }
                if(vowels.contains(now))
                    hasVowels=true;
                if((vowels.contains(now)&&vowels.contains(prev))||(!vowels.contains(now)&&!vowels.contains(prev))){
                    cnt++;
                }else
                    cnt=0;
                if(cnt==2)
                    isTriple=true;
                prev=now;
            }
            if(hasVowels&&!isTriple&&!isDouble){
                bw.write(String.format("<%s> is acceptable.\n",input));
            }else
                bw.write(String.format("<%s> is not acceptable.\n",input));
        }
        bw.flush();
    }
}
