package programmers.p148652;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p148652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int l = Integer.parseInt(br.readLine());
        int r = Integer.parseInt(br.readLine());
        System.out.println(solution(N,l,r));
    }

    public static long solution(int n, long l, long r){
        long answer = 0;
        String[] arr = new String[21];
        String str1 = "";
        arr[0] = "1";
        for(int i=1; i<=n;i++){
            String str = arr[i-1];
            str = str.replaceAll("0","00000");
            str = str.replaceAll("1","11011");
            if(i==n){
                str1=str.substring((int) l-1, (int) r);
            }
            arr[i]=str;
        }
        for(int i=0; i<str1.length();i++){
            if(str1.charAt(i)=='1'){
                answer++;
            }
        }
        return answer;
    }
}

