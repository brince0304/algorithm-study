import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class a1075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a= Integer.parseInt(br.readLine());
        int b= Integer.parseInt(br.readLine());
        br.close();
        int idx=0;
            for(int i=a-(a%100);i<a+100;i++){
                if(i%b==0){
                    String str = String.valueOf(i);
                    bw.write(str.substring(str.length()-2,str.length())+"\n");
                    break;
                }
            }
        bw.flush();
        bw.close();
    }
}
