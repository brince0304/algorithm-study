import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class a02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int sum =0;
        Integer[] arr = new Integer[N];
        for(int i=0; i<N ;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr,(o1,o2)-> o2-o1);
        int temp = K;
        for(int i=0; i<M; i++){
            if(temp==0 && arr[0]>arr[1]){
                temp=0;
                sum+=arr[1];
            }else {
                sum += arr[0];
                temp--;
            }

        }
        System.out.println(sum);
    }
}
