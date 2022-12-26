import java.io.*;
public class a2439 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        br.close();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++) {
            sb.append("*");
        }
        for(int i=n-1;i>=0;i--){
            bw.write(sb+"\n");
            sb.deleteCharAt(i);
        }
        bw.flush();
        bw.close();
    }
}
