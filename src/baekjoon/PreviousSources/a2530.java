import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class a2530 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int sec =  Integer.parseInt(st.nextToken());
        int need = Integer.parseInt(br.readLine());
        min += need/60;
        sec += need%60;
        min += sec/60;
        sec = sec%60;
        hour += min/60;
        min = min%60;
        hour = hour%24;
        bw.write(hour+" "+min+" "+sec+"\n");
        bw.flush();
        bw.close();
    }
}
