import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class a23757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        PriorityQueue<Integer> queue1 = new PriorityQueue<>(Collections.reverseOrder());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            queue1.add(Integer.valueOf(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        boolean yn = true;
        for(int i=0; i<M;i++){
            int m = Integer.parseInt(st.nextToken());
            int n = queue1.peek();
            if(n<m){
                yn=false;
                break;
            }
            else{
                queue1.add(queue1.poll()-m);
            }
        }
        if(yn){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
