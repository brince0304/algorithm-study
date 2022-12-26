import java.io.*;
import java.util.StringTokenizer;

public class a1225 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String n1 = st.nextToken();
        String n2 = st.nextToken();
        long total=0;
        for(int i=0;i<n1.length();i++){
            for(int j=0; j<n2.length();j++){
                total+= (n1.charAt(i)-'0')*(n2.charAt(j)-'0');
            }
        }
        if(n1.equals("0")){total=0;}
        bw.write(total+"\n");
        bw.flush();
        bw.close();
    }
}
