import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class a10870 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int total =0;
        List<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
;        for(int i=1;i<a;i++){
            total = arr.get(i)+arr.get(i-1);
            arr.add(total);
        }
        if(a==0){System.out.println(0);}
            if(a==1){System.out.println(1);}
                else{        System.out.println(total);}

    }
}
