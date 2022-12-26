import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class a1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int count = 0;
        int tmp =a;
        while(true){
            count++;
            tmp= ((tmp%10)*10)+((tmp/10)+(tmp%10))%10;
            if(tmp==a){System.out.print(count); break;}
        }
    }
}
