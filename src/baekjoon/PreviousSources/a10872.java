import java.io.*;

public class a10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int total = n;
        for (int i = n - 1; i > 0; i--) {
                total = total * i;
            }
        if(total ==0 ){bw.write(1+"\n");}
            else{bw.write(total + "\n");}
            br.close();
            bw.flush();
            bw.close();
        }
    }
