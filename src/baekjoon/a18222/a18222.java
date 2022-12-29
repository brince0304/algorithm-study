package baekjoon.a18222;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a18222 {
    public static String str="0";
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        System.out.println(recur(N));
    }
    public static String recur(long N){
        if(str.length()>N){
            return String.valueOf(str.charAt((int) (N-1)));
        }
        String a = str.replaceAll("0","A");
        a = a.replaceAll("1","B");
        a = a.replaceAll("B","0");
        a = a.replaceAll("A","1");
        str += a;
        return recur(N);
    }
}
