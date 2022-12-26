import java.io.*;

public class a2744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String a = br.readLine();
        String str = "";
        br.close();
        for(int i=0;i<a.length();i++){
            char c = a.charAt(i);
            if(Character.isUpperCase((c))){
                sb.append(String.valueOf(c).toLowerCase());
            }
            else if(Character.isLowerCase(c)){
                sb.append(String.valueOf(c).toUpperCase());
            }
        }
        bw.write(sb+"\n");
        bw.flush();
        bw.close();

    }
}
