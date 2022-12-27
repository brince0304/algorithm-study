package baekjoon.a2447;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class a2447 {
    public static char[][] arr;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        arr= new char[N][N];
        for(int i=0; i<N;i++){
            Arrays.fill(arr[i],' ');
        }
        func(0,0,N);
        for(int i=0; i<N; i++){
            for(int j=0;j<N;j++){
                sb.append(arr[i][j]);
            }
           sb.append("\n");
        }
        System.out.println(sb);

    }
    public static void func(int row,int col, int N){
        if(N==1){
            arr[row][col]='*';
            return;
        }
        N = N/3;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i ==1 && j==1){
                    continue;
                }else{
                    func(row+(i*N),col+(j*N),N);
                }
            }
        }

    }

}
