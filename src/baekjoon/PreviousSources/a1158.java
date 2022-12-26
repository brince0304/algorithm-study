import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class a1158 {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    ArrayDeque<Integer> que = new ArrayDeque<>();
    StringBuilder sb = new StringBuilder();
    sb.append("<");
    for(int i=1; i<=N;i++){
        que.offer(i);
    }
    while(que.size()!=1){
        for(int i=0;i<K-1;i++){
            que.offer(que.poll());
        }
        sb.append(que.poll()+", ");
    }
    sb.append(que.poll()+">");
        System.out.println(sb.toString()+"\n");
    }
}
