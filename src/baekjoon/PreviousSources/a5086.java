import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class a5086 {
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a==0 && b==0){break;}
            if(b%a==0){
                System.out.println("factor");}
            else if(a%b==0){
                System.out.println("multiple");}
            else{
                System.out.println("neither");}
        }
    }
}