package baekjoon.a9095;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[11];
        dp[1]=1;
        dp[2]=2;
        dp[3]=4;
        dp[4]=7;
        for(int i=0; i<N;i++){
            int n = Integer.parseInt(br.readLine());
            for(int j=4; j<=n;j++){
                dp[j]=dp[j-3]+dp[j-2]+dp[j-1];
            }
            System.out.println(dp[n]);
        }
    }
}
