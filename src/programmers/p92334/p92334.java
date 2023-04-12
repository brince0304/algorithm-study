package programmers.p92334;

import java.util.*;

public class p92334 {
    public static List<Integer> solution(String[] id_list, String[] report, int k) {
        List<Integer> answer = new ArrayList<>();
        HashMap<String,Integer> idxMap = new HashMap<>();
        HashMap<String,Integer> reportedMap = new HashMap<>();
        int[][] reportArr = new int[id_list.length][id_list.length];
        int[][] emailArr = new int[id_list.length][1];
        int idx = 0;
        for(String id : id_list){
            reportedMap.put(id,0);
            idxMap.put(id,idx);
            for(int j=0; j<id_list.length;j++){
                reportArr[idx][j]=0;
            }
            idx++;
        }
        for(String detail:report){
            int spaceIdx = detail.indexOf(" ");
            String reportFrom = detail.substring(0,spaceIdx);
            String reportTo = detail.substring(spaceIdx+1,detail.length());
            int fromIdx = idxMap.get(reportFrom);
            int toIdx = idxMap.get(reportTo);
            if(reportArr[toIdx][fromIdx]!=1){
                reportArr[toIdx][fromIdx]=1;
                reportedMap.put(reportTo,reportedMap.get(reportTo)+1);
            }
        }
        reportedMap.forEach((key,value)->{
            if(value>=k){
                int toIdx = idxMap.get(key);
                for(int i=0; i<id_list.length;i++){
                    if(reportArr[toIdx][i]==1){
                        emailArr[i][0]++;
                    }
                }
            }
        });
        for(int i=0; i<id_list.length;i++){
            answer.add(emailArr[i][0]);
        }
        return answer;
    }

    public static void main(String[] args) {
      String[] id_list = {"con", "ryan"};
      String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
      int k = 2;
        System.out.println(solution(id_list, report, k));
    }
}
