import java.io.*;
import java.util.StringTokenizer;

public class a2845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st= new StringTokenizer(br.readLine());
        int q = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        br.close();
        int sum = a*b;
        bw.write((q-sum)+" "+(w-sum)+" "+(e-sum)+" "+(r-sum)+" "+(y-sum)+"\n");
        bw.flush();
        bw.close();
    }
}
