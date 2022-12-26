import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class a1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int c1 = Math.abs(0-x);
        int c2 = Math.abs(0-y);
        int c3=  Math.abs(x-w);
        int c4= Math.abs(y-h);
        int[] arr = {c1,c2,c3,c4};
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
}
