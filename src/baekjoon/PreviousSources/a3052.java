import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class a3052 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Set<Integer> st = new HashSet<>();
        for(int i=0;i<10;i++){
            int n = Integer.parseInt(br.readLine());
            st.add(n%42);
        }
        System.out.println(st.size());
    }
}
