package programmers.p176962;

import java.util.*;

public class p176962 {
    public static List<String> solution(String[][] plans) {
        List<Node> list = new ArrayList<>();
        Stack<Node> notFinished = new Stack<>();
        List<String> result = new ArrayList<>();
        for (int i = 0; i < plans.length; i++) {
            String startTime = plans[i][1];
            int startH = Integer.parseInt(startTime.substring(0, 2));
            int startM = Integer.parseInt(startTime.substring(3, 5));
            int totalMinute = startH * 60 + startM;
            list.add(new Node(plans[i][0],totalMinute,Integer.parseInt(plans[i][2])));
        }
        list.sort(Comparator.comparingInt(o -> o.start));

        for(int i=0; i< list.size()-1 ;i++){
            Node now = list.get(i);
            Node next =list.get(i+1);
            int curr = now.playTime+now.start;
            int nTime = next.start;
            if(curr<=nTime){
                result.add(now.name);
                if(i+2==list.size()){
                    result.add(next.name);
                    while(!notFinished.isEmpty()){
                        result.add(notFinished.pop().name);
                    }
                }
            }else{
                int rest = curr - nTime;
                now.playTime = rest;
                notFinished.push(now);
                while(!notFinished.isEmpty() && rest < 0){
                    Node not = notFinished.pop();
                    if(not.playTime <= rest){
                        result.add(not.name);
                    }else{
                        not.playTime -= rest;
                    }
                }
            }
        }
        return result;
    }

    static class Node {
        String name;
        int start;
        int playTime;

        public Node(String name, int start, int playTime) {
            this.name = name;
            this.start = start;
            this.playTime = playTime;
        }

    }

    public static void main(String[] args) {
        String[][] plans = {{"aaa", "12:00", "20"}, {"bbb", "12:10", "30"}, {"ccc", "12:40", "10"}};

        System.out.println(solution(plans));
    }
}
