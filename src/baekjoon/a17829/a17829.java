package baekjoon.a17829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;
import java.util.StringTokenizer;

public class a17829 {
    public static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(func(0,0,N));
    }

    public static int func(int row,int col,int N){
        if(N==2){
            int count=0;
            int[] funcArr= new int[4];
            for(int i=row ; i<row+N;i++){
                for(int j=col ; j<col+N; j++){
                    funcArr[count] = arr[i][j];
                    count++;
                }
            }
            Arrays.sort(funcArr);
            return funcArr[funcArr.length-2];
        }
        N = N/2;
        int[] funcArr = new int[4];
        int count =0;
        for(int i=0; i<2;i++){
            for(int j=0; j<2;j++){
                funcArr[count] = func(row+(i*N),col+(j*N),N);
                count++;
            }
        }
        Arrays.sort(funcArr);
        return funcArr[funcArr.length-2];
    }
}
