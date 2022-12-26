import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class a2581 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        int sum=0;
        for(int i=n; i<=m; i++){
            if(isPrime(i)){
                if(i!=1) {
                    arr.add(i);
                    sum += i;
                }
            }
        }
        if(sum!=0){
            System.out.print(sum+"\n");
            System.out.print(arr.get(0));
        }
        else{
            System.out.print("-1");
        }
    }
    public static boolean isPrime(int a){
        for(int i=2; i<=Math.sqrt(a);i++){
            if(a%i==0){ return false;}
        }
        return true;
    }
}

