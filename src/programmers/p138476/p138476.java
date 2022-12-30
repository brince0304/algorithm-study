package programmers.p138476;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class p138476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
    }
    public static int num =0;
    public static int answer = 0;
    public static int solution(int k,int[] t){
        num = k;
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i=0;i<t.length; i++){
           map.put(t[i],map.getOrDefault(t[i],0)+1);
       }
       List<Map.Entry<Integer,Integer>> list = map.entrySet().stream().sorted(((o1, o2) -> o2.getValue()-o1.getValue())).collect(Collectors.toList());
       for(Map.Entry<Integer,Integer> key : list){
           if(num<=key.getValue()){
               answer++;
               return answer;
           }else{
               num -= key.getValue();
                answer++;
           }
       }return answer;
    }
}
