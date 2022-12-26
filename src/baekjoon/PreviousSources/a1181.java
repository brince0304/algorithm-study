import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Comparator;

public class a1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }
        br.close();
        String[] wordarr = new String[set.size()];
        set.toArray(wordarr);
        Arrays.sort(wordarr);
        Arrays.sort(wordarr, (o1, o2) -> Integer.compare(o1.length(), o2.length()));
        for(int i=0;i<wordarr.length;i++) {
            sb.append(wordarr[i]+"\n");
        }
        System.out.print(sb);
    }
    }