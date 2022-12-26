import java.io.*;
import java.util.Arrays;

public class a2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        double tmp = 0;
        int b = arr[(arr.length - 1) / 2];
        for (int i = 0; i < arr.length; i++) {
            tmp += arr[i];
        }
        int count = 0;
        int max = -1;
        int mod = arr[0];
        boolean check = false;
        //최빈값 구하는 반복문
        for(int i = 0; i < N - 1; i++) {
            if(arr[i] == arr[i + 1]) {
                count++;
            }else {
                count = 0;
            }
            if(max < count) {
                max = count;
                mod = arr[i];
                check = true;
            }else if(max == count && check == true) {
                mod = arr[i];
                check = false;
            }
        }
            int a = (int) Math.round(tmp / arr.length);
            int d = arr[arr.length - 1] - arr[0];
            System.out.print(a + "\n");
            System.out.print(b + "\n");
            System.out.print(mod+"\n");
            System.out.print(d + "\n");

        }
    }
