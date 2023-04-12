package programmers.p133499;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class p133499 {
    public static int solution(String[] babbling) {
        int answer = 0;
        ArrayDeque<String> can = new ArrayDeque<>(List.of("aya","ye","woo","ma"));
        for(int i=0; i<babbling.length; i++){
            String tmp = babbling[i];
            StringBuilder sb = new StringBuilder();
            while(!can.isEmpty()){
                String s = can.pop();
                if(tmp.contains(s)){
                    sb.append(s);
                }
            }
            if(tmp.contentEquals(sb)){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        System.out.println(solution(babbling));
    }
}
