import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class a9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String left = "(";
        String right = ")";
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N;i++){
            Stack<Character> stack = new Stack<>();
            String str = br.readLine();
            for(int j=0; j<str.length();j++){
                if(str.charAt(j)=='('){
                    stack.push('(');
                }
                else{
                    if(stack.contains('(')){
                        stack.pop();
                    }
                    else{
                        stack.push(')');
                    }
                }
            }
           if(stack.size()==0){
               System.out.println("YES");
           }
           else{
               System.out.println("NO");
           }
        }
    }
}
