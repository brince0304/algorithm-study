import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class a2083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
                StringBuilder sb = new StringBuilder();
                String s = sc.nextLine();
                if(s.contains("#")){break;};
                StringTokenizer st = new StringTokenizer(s);
                List<String> list = new ArrayList<>();
                while (st.hasMoreTokens()) {
                    list.add(st.nextToken());
                }
                sb.append(list.get(0) + " ");
                if (Integer.parseInt(list.get(1)) > 17 || Integer.parseInt(list.get(2)) >= 80) {
                    sb.append("Senior");
                } else {
                    sb.append("Junior");
                }
                System.out.println(sb);
            }
        }
    }
