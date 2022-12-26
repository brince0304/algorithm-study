import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class a14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int count = 0;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < a; i++) {
            map.put(br.readLine(), 0);
        }
        for (int i = 0; i < b; i++) {
            if (map.containsKey(br.readLine())) {
                count++;
            }

        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}
