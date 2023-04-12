package programmers.p172928;

import java.util.Arrays;

public class p172928 {

    public static int[] solution(String[] park, String[] routes) {
        int x = park[0].length();
        int y = park.length;
        char[][] map = new char[y][x];
        int currentX =0; int currentY =0;
        for(int i=0; i<y;i++){
            for(int j=0; j<x;j++){
                char tmp = park[i].charAt(j);
                map[i][j]=tmp;
                if(tmp=='S'){
                    currentX=j;
                    currentY=i;
                }
            }
        }
        for(int i=0; i< routes.length;i++){
            char op = routes[i].charAt(0);
            int n = Integer.parseInt(routes[i].substring(2));
            boolean flag = false;
            if(op == 'W' || op == 'E'){
                if(op=='W'){
                    if(currentX-n<0){
                        continue;
                    }
                    for(int j=currentX; j>=currentX-n; j--){
                        char now = map[currentY][j];
                        if(now=='X'){
                            flag = true;
                            break;
                        }
                    }
                    if(!flag){
                        currentX-=n;
                    }
                }
                if(op=='E'){
                    if(currentX+n>=x){
                        continue;
                    }
                    for(int j=currentX; j<=currentX+n; j++){
                        char now = map[currentY][j];
                        if(now=='X'){
                            flag = true;
                            break;
                        }
                    }
                    if(!flag){
                        currentX+=n;
                    }
                }
            }
            if(op == 'N' || op == 'S'){
                if(op=='N'){
                    if(currentY-n<0){
                        continue;
                    }
                    for(int j=currentY; j>=currentY-n; j--){
                        char now = map[j][currentX];
                        if(now=='X'){
                            flag = true;
                            break;
                        }
                    }
                    if(!flag){
                        currentY-=n;
                    }
                }
                if(op=='S'){
                    if(currentY+n>=y){
                        continue;
                    }
                    for(int j=currentY; j<=currentY+n; j++){
                        char now = map[j][currentX];
                        if(now=='X'){
                            flag = true;
                            break;
                        }
                    }
                    if(!flag){
                        currentY+=n;
                    }
                }
            }
        }
        int [] answer= {currentY, currentX};
       return answer;
    }

    public static void main(String[] args) {
        String[] park = {"SOOOX","OOOOO","OOOOO", "OOOOO", "OOOOO"};
        String[] routes = {"E 3"};
        System.out.println(Arrays.toString(solution(park, routes)));
    }
}
