import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
public class a15903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Integer.parseInt(st.nextToken());
        long M = Integer.parseInt(st.nextToken());
        PriorityQueue<Long> queue = new PriorityQueue<>();
         st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            queue.add(Long.valueOf(st.nextToken()));
        }
        for(int i=0;i<M;i++) {
            long a = queue.poll();
            long b = queue.poll();
            queue.add(a + b);
            queue.add(a + b);
        }
        long sum = queue.stream().mapToLong(Long::longValue).sum();
        System.out.println(sum);
    }
}
