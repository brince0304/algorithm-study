import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class a4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N;i++){
            double sum=0;
            double count=0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[Integer.parseInt(st.nextToken())];
            for(int j=0; j<arr.length; j++){
                arr[j] = Integer.parseInt(st.nextToken());
                sum+= arr[j];
            }
            double avg = sum/arr.length;
            for(int k=0;k<arr.length;k++){
                if(arr[k]>avg){
                    count++;
                }
            }
            System.out.println(String.format("%.3f",count/arr.length*100)+"%");
        }
        br.close();
    }
}
