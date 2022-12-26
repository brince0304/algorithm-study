import java.io.*;
import java.util.*;

public class a5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
            ArrayDeque<Integer> que = new ArrayDeque<>();
            StringBuilder sb = new StringBuilder();
            boolean err = false;
            boolean dir = true;
            String order = br.readLine();
            int N = Integer.parseInt(br.readLine());
            String arr = br.readLine();
            arr = arr.replace("[",",").replace("]",",");
            StringTokenizer st = new StringTokenizer(arr,",");
            while(st.hasMoreTokens()){
                que.add(Integer.parseInt(st.nextToken()));
            }
            sb.append("[");
            for(int i=0; i<order.length();i++){
                char ch = order.charAt(i);
                switch(ch){
                    case 'R':
                        dir=!dir;
                        break;
                    case 'D':
                        if(que.isEmpty()){err=true; break;}
                        else {
                            if (dir) {
                                    que.pollFirst();
                            }
                            else {
                                    que.pollLast();
                                }
                            }
                        break;
                }

            }
            while(!que.isEmpty()){
                if(dir){
                    sb.append(que.pollFirst()+",");
                }
                else{
                    sb.append(que.pollLast()+",");
                }
            }
            if(err){
                System.out.println("error");
            }
            else{
                sb.deleteCharAt(sb.length() - 1).append("]");
                System.out.println(sb);
            }
        }

        }
    }
