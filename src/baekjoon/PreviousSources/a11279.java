import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class a11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            int n = Integer.parseInt(br.readLine());
            if(n==0){
                if(queue.size()==0){
                    sb.append("0\n");
                }
                else{
                    sb.append(queue.poll()).append("\n");
                }
            }
            else{
                queue.add(n);
            }
        }
        System.out.println(sb);
    }

}
