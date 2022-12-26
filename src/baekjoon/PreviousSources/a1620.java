import java.io.*;
import java.util.*;

public class a1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String,String> map = new HashMap<>();
        HashMap<String,String> map2 = new HashMap<>();
        for(int i=0;i<N;i++){
            String pokemon = br.readLine();
            map.put(pokemon,String.valueOf(i+1));
            map2.put(String.valueOf(i+1),pokemon);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<M;i++){
            String question = br.readLine();
            if(map.get(question)!=null) {
                sb.append(map.get(question)+"\n");
            }
            else if (map2.get(question)!=null){
                sb.append(map2.get(question)+"\n");
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();;
    }
}

