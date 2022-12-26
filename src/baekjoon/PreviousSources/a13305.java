import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] arr1 = new long[N-1];
        long[] arr2 = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i< N-1;i++){
            arr1[i]= Long.parseLong(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N;i++) {
            arr2[i] = Long.parseLong(st.nextToken());
        }
        long count =0;
        long min = arr2[0];
        for(int i=0; i<N-1;i++){
            if(min>arr2[i]){
                min = arr2[i];
            }
            count += arr1[i]*min;
        }

        System.out.println(count);
    }
}
