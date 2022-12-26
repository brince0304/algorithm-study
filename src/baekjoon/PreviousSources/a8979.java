import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class a8979 {
    public static void main(String[] args) throws NumberFormatException,IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] arr2 = new int[N + 1][3];
        int rank =1;
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr2[num][0] = g;
            arr2[num][1] = s;
            arr2[num][2] = b;
        }
        for(int i=1; i<=N; i++){
            if(arr2[i][0] > arr2[K][0]){
                rank++;
            }
            else if( arr2[i][0]== arr2[i][0] && arr2[i][1]> arr2[K][1]){
                rank++;
            }
            else if( arr2[i][0]== arr2[i][0] && arr2[i][1] == arr2[K][1] &&
            arr2[i][2] > arr2[K][2]){
                rank++;
            }
        }
        bw.write(String.valueOf(rank));
        bw.flush();
        br.close();
        bw.close();


    }
}
