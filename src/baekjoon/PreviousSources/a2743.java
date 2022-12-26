import java.io.*;

public class a2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int b =a;
        br.close();
        for(int i=0;i<a;i++){
            bw.write(b+"\n");
            b--;
        }
        bw.flush();
        bw.close();
    }
}
