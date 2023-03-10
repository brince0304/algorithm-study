import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class a10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] arr = new String[n][2];
        for(int i=0; i<n; i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            for(int j=0; j<2;j++){
                arr[i][j]= st.nextToken();
            }
        }
        br.close();
        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
            }
        });
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i][0]+" "+arr[i][1]+"\n");
        }
        System.out.print(sb);
    }
}
