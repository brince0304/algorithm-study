import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class a11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] a = new int[n][2];
        for(int i=0;i<a.length;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        Arrays.sort(a, new Comparator<int[]>() {
                    @Override
                    public int compare(int[] o1, int[] o2) {
                        if(o1[0]==o2[0]){
                            return o1[1]-o2[1];
                        }
                        else{return o1[0]-o2[0];
                        }
                    }
                });
                StringBuilder sb = new StringBuilder();
        for(int i=0; i<a.length; i++){
            sb.append(a[i][0]+" "+a[i][1]+"\n");
        }
        System.out.print(sb);
    }
}
