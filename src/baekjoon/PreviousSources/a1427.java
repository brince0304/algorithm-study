import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class a1427 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] arr = new int[str.length()];
        for(int i=0; i< arr.length; i++){
            arr[i] = str.charAt(i)-'0';
        }
        Integer[] array = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(array, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length; i++ ){
            sb.append(array[i]);
        }
        System.out.print(sb);
    }
}
