package baekjoon.a1074;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a1074 {
    static int N,r,c,count=0;
    public static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        int newN = 1;
        for (int i = 0; i < N; i++) {
            newN *= 2;
        }
        arr = new int[newN][newN];
    }
    }
