package baekjoon.a5525;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a5525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int S = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        sb.append("IOI");
        String M = br.readLine();
        int count =0;
        int tmp =0;
        if(N>1){
            sb.append("OI".repeat(N - 1));
        }

    }
}
