import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int count = 0;
        for(int i=0; i<N;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        for(int i=N-1; i>=0 ; i--){
            int tmp =0;
            if(arr[i]<K){
                tmp = K/arr[i];
                count += K/arr[i];
                K = K - (arr[i]*tmp);
            }
        }
        System.out.print(count);
    }


}
