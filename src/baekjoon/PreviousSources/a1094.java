import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class a1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int N = 64;
        int count = 0;
        while(X>0){
            if(N>X){
                N/=2;
            }
            else{
                X-= N;
                count++;
            }
        }
        System.out.println(count);
    }
}
