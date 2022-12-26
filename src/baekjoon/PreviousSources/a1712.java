import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class a1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        br.close();
        if (b>=c) {
            System.out.println("-1");
        } else {
            bw.write((a / (c-b))+1 + "\n");
            bw.flush();
            bw.close();
        }

    }
}
