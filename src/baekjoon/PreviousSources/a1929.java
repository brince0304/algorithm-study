import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a1929 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        //소수 판별 배열 N까지 나타내기위해 범위는 N+1로
        //소수 판별은 꼭 boolean 형을 사용하지 않고 int형이나 String형 같이 다른 자료형을 사용해도 된다.
        boolean[] arr = new boolean[N + 1];
        StringBuilder sb = new StringBuilder();
        arr[0] = true;
        arr[1] = true;
        for(int i = 2; i * i <= N; i++) {
            if(!arr[i]) {
                for(int j = i * i; j <= N; j += i) {
                    arr[j] = true;
                }
            }
        }

        for(int i = M; i <= N; i++) {
            if(!arr[i]) sb.append(i).append("\n");
        }
        System.out.println(sb);
    }

}