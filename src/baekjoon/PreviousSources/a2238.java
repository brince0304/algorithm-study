import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class a2238 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int U = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        List<String> name = new ArrayList<>();
        List<Integer> price = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            String n = st.nextToken();
            int p = Integer.parseInt(st.nextToken());
            if (price.contains(p)) {
                map.put(p, map.get(p) + 1);
            } else {
                name.add(n);
                price.add(p);
                map.put(p, 0);
            }
        }

        Integer[] count = map.values().stream().sorted().toArray(Integer[]::new);
        int p = map.entrySet().stream().filter(v -> v.getValue() == count[0]).findFirst().get().getKey();
        for (int i = 0; i < price.size(); i++) {
            if (p == price.get(i)) {
                idx = i;
            }
        }
        System.out.print(name.get(idx) + " " + p);


    }


}
