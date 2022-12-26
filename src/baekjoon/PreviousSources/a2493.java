import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class a2493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Stack<Integer[]> stack = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            int n = Integer.parseInt(st.nextToken());
            while(!stack.isEmpty()){
                if(stack.peek()[1]>=n){
                    sb.append(stack.peek()[0]).append(" ");
                    break;
                }
                stack.pop();
            }
            if(stack.isEmpty()){
                sb.append("0 ");
            }
            stack.push(new Integer[] {i+1,n});
        }
        System.out.println(sb);
    }
}
