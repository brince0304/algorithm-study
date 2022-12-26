import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class a18511 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        HashSet<Integer> set = new HashSet<>();
        st= new StringTokenizer(br.readLine());
        for(int i=0; i<K;i++){
            set.add(Integer.valueOf(st.nextToken()));
        }
        List<Integer> list = set.stream().sorted((o1, o2) -> o2-o1).toList();

    }


}
