import java.io.*;
import java.util.Arrays;

public class a2751 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(br.readLine());
        long[] arr = new long[(int) n];
        for(int i=0; i<n;i++){
            arr[i] = Long.parseLong(br.readLine());
        }
        br.close();
        Arrays.sort(arr);
        for(int i=0; i<arr.length;i++){
            bw.write(arr[i]+"\n");
        }
        bw.flush();
        bw.close();
    }
}
