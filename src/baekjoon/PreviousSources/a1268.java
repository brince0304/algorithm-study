import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class a1268 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][5];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(i, 0);
        }
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int tmp = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (tmp != arr[j][i]) {
                    tmp = arr[j][i];
                } else if (tmp == arr[j][i]) {
                }
            }
            System.out.println(map);
        }
    }
}