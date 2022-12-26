import java.util.Scanner;
import java.math.BigInteger;
public class a1271{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger m = sc.nextBigInteger();
        BigInteger n = sc.nextBigInteger();
        sc.close();
        System.out.println(m.divide(n));
        System.out.println(m.remainder(n));
    }
}