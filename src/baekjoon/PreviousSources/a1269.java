import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class a1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();
        StringTokenizer st= new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N;i++){
            int a = Integer.parseInt(st.nextToken());
            set1.add(a);
            set3.add(a);
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M;i++){
            int a = Integer.parseInt(st.nextToken());
            set2.add(a);
        }
        set1.removeAll(set2);
        set2.removeAll(set3);
        System.out.println(set1.size()+set2.size());
    }
}
