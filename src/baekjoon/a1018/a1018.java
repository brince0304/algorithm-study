package baekjoon.a1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int count =0;
        String[] arr = new String[N];
        int index = -1;
        for(int i=0; i<N;i++){
            arr[i]=br.readLine();
            while(index==-1) {
                for (int j = 0; j < arr[i].length() - 2; j++) {
                    if (arr[i].charAt(j) == arr[i].charAt(j + 1)) {
                        break;
                    } else {
                        index = j;
                    }
                }
            }
        }
        for(int i=0; i<N; i++){
            for(int j=0;j<arr[index].length();j++){
                if(arr[i].charAt(j)!=arr[index].charAt(j)){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
