package programmers.p176963;

import java.util.*;

public class p176963 {
    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String,Integer> yearningMap = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        int idx =0;
        for(String n: name){
                yearningMap.put(n,yearning[idx]);
                idx++;
        }
        for(int i=0; i<photo.length; i++){
            for(String n : photo[i]){
                if(yearningMap.containsKey(n)){
                    answer[i]=answer[i]+yearningMap.get(n);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning ={5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"},{"kon", "kain", "may", "coni"}};
        System.out.println(Arrays.toString(solution(name, yearning, photo)));
    }
}
