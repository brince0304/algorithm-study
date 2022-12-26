import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class a2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> que = new ArrayDeque<>();
        for(int i=1; i<=N;i++){
            que.offer(i);
        }
        while(que.size()!=1){
            que.poll();
            que.offer(que.pollFirst());
        }
        System.out.println(que.getFirst());
    }
}
