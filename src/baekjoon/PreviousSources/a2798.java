import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class a2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] arr = new int[a];
        int score =0;
        String nums = br.readLine();
        st = new StringTokenizer(nums," ");
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        br.close();
        score = search(arr,a,b);
        bw.write(score+"\n");
        bw.flush();
        bw.close();
    }
    static int search(int[] arr,int a,int b){
        int total=0;
        for(int i=0;i<a-2;i++){
            for(int j=i+1;j<a-1;j++){
                for(int k=j+1;k<a;k++){
                    int tmp = arr[i]+arr[j]+arr[k];
                    if(tmp==b){
                        return tmp;
                    }
                    if(total < tmp && tmp<b){
                        total = tmp;
                    }
                }
            }
        }return total;

    }
}
