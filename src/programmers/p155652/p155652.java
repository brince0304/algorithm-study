package programmers.p155652;

import java.util.*;

public class p155652 {
    public static void main(String[] args) {

    }
    public String solution(String s, String skip, int index) {
       String answer = "";
        HashSet<Character> skipSet = new HashSet<>();
        for(int i= 0; i<skip.length(); i++){
            skipSet.add(skip.charAt(i));
        }
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            int idx = 0;

            while(idx!=index){
                c++;
                if(c>'z'){
                    c='a';
                }
                if(!skipSet.contains(c)){
                    idx++;
                }

            }
            answer+=c;
        }
        return answer;
    }
}
