import java.io.*;
import java.util.*;

public class a1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String word = br.readLine();
        br.close();
        word = word.toLowerCase();
        int[] arr= new int[26];
        char most = '0';
        for(int i=0;i<word.length();i++){
            arr[word.charAt(i)-'a']++;
        }
        int max = -1;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
                most = (char)(i+'a');
            }
            else if(max==arr[i]){
                most='?';
            }
        }
        bw.write(String.valueOf(most).toUpperCase());
        bw.flush();
        bw.close();
    }
    }




