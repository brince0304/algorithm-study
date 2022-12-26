import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class a2167 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];
        for(int i=0; i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int K = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<K;i++){
            st= new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int sum =0;
            for(int j=b-1;j<arr[a-1].length;j++ ){
                sum+= arr[a-1][j];
            }
            for(int k=d-1;k<arr[c-1].length;k++){
                    sum+= arr[c-1][k];
                }
            if(a==c && b==d) {
                sum /= 2;
                sb.append(sum + "\n");
            }
            else{
                sb.append(sum+"\n");
            }
        }
        System.out.print(sb);

    }
}
