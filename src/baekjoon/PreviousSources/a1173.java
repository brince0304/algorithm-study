import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class a1173 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //운동 N분
        int m = Integer.parseInt(st.nextToken()); //최소 맥박
        int M = Integer.parseInt(st.nextToken()); //최대 맥박
        int T = Integer.parseInt(st.nextToken()); //증가 맥박
        int R = Integer.parseInt(st.nextToken()); //감소 맥박
        int current = m;
        int n = 0; // 현재 운동 분
        int count = 0; //초기값
        if (m + T > M) {
            System.out.print("-1");
        } else {
            while (n != N) {
                if (current + T <= M) {
                    current = current + T;
                    n++;
                } else if (current + T > M) {
                    if (current - R >= m) {
                        current = current - R;
                        count++;
                    } else {
                        current = m;
                        count++;
                    }
                }
            }
            System.out.print(count + N);
        }
    }
}
