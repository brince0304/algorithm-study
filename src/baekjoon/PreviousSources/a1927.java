import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class a1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            int n = Integer.parseInt(br.readLine());
            if(n!=0){
                queue.add(n);
            }
            else{
                if(queue.size()==0){
                    sb.append(0+"\n");
                }
                else{
                    sb.append(queue.poll()).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
