package baekjoon.a2579;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr= new int[N+1];
        int[] dp = new int[N+1];
        for(int i=1;i<=N;i++){
            arr[i]= Integer.parseInt(br.readLine());
        }
        dp[0]=0;
        arr[0]=0;

        for(int i=1; i<=N; i++){
            if(i==1){
                dp[i]=arr[i];
            }else if(i==2){
                dp[i]=Math.max(arr[2],dp[i-1]+arr[i]);
            }else{
                dp[i]= Math.max(dp[i-3]+arr[i-1]+arr[i],dp[i-2]+arr[i]);
            }
        }
        System.out.println(dp[N]);
    }
}
