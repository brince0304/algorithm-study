import java.io.*;

public class a2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int tmp =0;
        br.close();
        while(true){
            if(n%5==0){
                bw.write(n/5+tmp+"\n");
                break;
            }
            else if(n<0){
                bw.write("-1\n");
                break;
            }
            n-=3;
            tmp++;
        }
        bw.flush();
        bw.close();
    }
}
