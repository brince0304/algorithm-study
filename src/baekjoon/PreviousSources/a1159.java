import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class a1159 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int count = 0;
        String[] str = new String[n];
        while (n != count) {
            str[count] = br.readLine();
            count++;
        }
        br.close();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(str);
        int[] arr = new int[26];
        for (int j = 0; j < str.length; j++) {
            arr[str[j].charAt(0) - 'a']++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 5) {
                list.add(i);
            }
        }
        for(int i=0;i<list.size();i++){
            sb.append((char)(list.get(i)+'a'));
        }
        if (list.size() < 1) {
            System.out.println("PREDAJA");
        } else {
            System.out.print(sb);
        }
    }
}
