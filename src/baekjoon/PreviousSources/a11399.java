import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class a11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer[] arr = new Integer[N];
        for(int i=0; i<N; i++){
            arr[i]= Integer.valueOf(st.nextToken());
        }
        Arrays.sort(arr);
        int sum =0;
        int tmp =0;
        for(int i=0; i<N; i++){
           tmp += arr[i];
           sum+=tmp;
        }
        System.out.println(sum);
    }
}
