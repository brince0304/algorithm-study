package programmers.p178871;

import java.util.*;
import java.util.stream.Collectors;

public class p178871 {

    public static String[] solution(String[] players, String[] callings) {
        HashMap<String,Integer> callingMap = new HashMap<>();
        int tmp =0;
        for(String player : players){
            callingMap.put(player,tmp);
            tmp++;
        }
        for(String calling: callings){
            int idx = callingMap.get(calling);
            String front =  players[idx-1];
            players[idx-1] = calling;
            players[idx] = front;
            callingMap.put(calling,idx-1);
            callingMap.put(front,idx);
        }
        return players;
    }

    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        System.out.println(Arrays.toString(solution(players, callings)));
    }


}
