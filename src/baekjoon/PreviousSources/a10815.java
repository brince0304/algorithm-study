import org.w3c.dom.Node;

import java.io.*;
import java.util.*;

public class a10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        List<Integer> arr1 = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr1.add(Integer.parseInt(st.nextToken()));
        }
        int m = Integer.parseInt(br.readLine());
        List<Integer> arr2 = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            arr2.add(Integer.parseInt(st.nextToken()));
        }
        StringBuilder sb = new StringBuilder();

    }

}