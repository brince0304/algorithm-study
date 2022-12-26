import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class a1978 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int count =0;
        for(int i=0; i<N;i++){
            if(isPrime(arr[i])&&arr[i]!=1){
                count++;
            }
        }
        System.out.print(count);

    }
    public static boolean isPrime(int a){
        for(int i=2; i<=Math.sqrt(a); i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
}
