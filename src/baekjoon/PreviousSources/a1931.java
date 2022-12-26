import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.StringTokenizer;

public class a1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Integer[][] arr = new Integer[N][2];
        for(int i=0; i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0]= Integer.valueOf(st.nextToken());
            arr[i][1]= Integer.valueOf(st.nextToken());
        }
        int count =0;
        int temp = 0;
        Arrays.sort(arr, (o1, o2) -> {
            if (Objects.equals(o1[1], o2[1])) {
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });
        for (Integer[] integers : arr) {
            if (temp <= integers[0]) {
                temp = integers[1];
                count++;
            }
        }
        System.out.println(count);
    }
}
