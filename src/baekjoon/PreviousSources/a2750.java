import java.io.*;
import java.util.Arrays;

public class a2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int[] arr = new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            bw.write(arr[i]+"\n");
        }
        bw.flush();
        bw.close();
    }
}
