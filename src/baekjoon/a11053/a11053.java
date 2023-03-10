package baekjoon.a11053;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a11053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N+1];
        int[] arr = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N;i++){
            arr[i]= Integer.parseInt(st.nextToken());
        }
        dp[1]=1;
        int max = Integer.MIN_VALUE;
        for(int i=1;i<=N;i++){
          if(arr[i]>max){
              max=arr[i];
              dp[i]=dp[i-1]+1;
          }else{
              dp[i]=1;
          }
        }
        System.out.println(dp[N]);
    }
}
