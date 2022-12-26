import java.io.*;
import java.util.*;

public class a10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> list = new Stack<>();
        int K = Integer.parseInt(br.readLine());
        int sum=0;
        for(int i=0;i<K;i++){
            int num = Integer.parseInt(br.readLine());
            if(num ==0){
                list.pop();
            }
            else{
                list.push(num);
            }
        }
        br.close();
        for(int i=0; i<list.size();i++){
            sum+= list.get(i);
        }
        bw.write(sum+"\n");
        bw.flush();
        bw.close();
    }
}
