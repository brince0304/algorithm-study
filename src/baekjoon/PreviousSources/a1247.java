import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class a1247 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<3;i++){
            int a= Integer.parseInt(br.readLine());
            BigInteger b = new BigInteger("0");
            for(int j=0;j<a;j++){
                b = b.add(new BigInteger(br.readLine()));
            }
            if(b.compareTo(BigInteger.ZERO)==1){
                System.out.println("+");
            }
            else if(b.compareTo(BigInteger.ZERO)==0){
                System.out.println("0");
            }
            else if(b.compareTo(BigInteger.ZERO)==-1){
                System.out.println("-");
            }
        }
    }

}
