import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class a1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N;i++) {
            ArrayDeque<int[]> que = new ArrayDeque<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int count =0;
            while(!que.isEmpty()){
                int[] first = que.poll();
                boolean max = true;
                for(int j=0; j<que.size();j++){
                    if(first[1]<que.getFirst()[1]){
                        que.offer(first);
                        for(int k=0; k<j;k++){
                            que.offer(que.poll());
                        }
                        max=false;
                        break;
                    }
                }
                if(!max){
                    continue;
                }
            }

        }
        System.out.println(sb.toString()+"\n");
    }
}
