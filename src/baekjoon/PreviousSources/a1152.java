import java.io.*;
import java.util.StringTokenizer;

public class a1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        br.close();
        str.trim();
        StringTokenizer st = new StringTokenizer(str," ");
        bw.write(st.countTokens()+"\n");
        bw.flush();
        bw.close();
    }
}
