import java.util.Scanner;

public class a2480 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a==b && c!=a){
            System.out.println(1000+100*a);
        }
        else if(b==c && a!=b){
            System.out.println(1000+100*b);
        }
        else if(a==c && a!=b){
            System.out.println(1000+100*a+"");
        }
        else if(a==b && b==c && a==c){
            System.out.println(10000+1000*a);
        }
        else {
            System.out.println(Math.max(Math.max(a,b),c)*100);
        }
    }
}
