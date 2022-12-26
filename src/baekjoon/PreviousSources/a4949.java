import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class a4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String str =br.readLine();
            if(str.equals(".")){
                break;
            }
            System.out.println(check(str));
        }
    }
    public static Stack<Character> deque = new Stack<>();
    public static String check(String str){
        deque.clear();
        for(int i=0; i<str.length();i++){
            char c = str.charAt(i);
            if(c=='(' || c=='[') {
                deque.push(c);
            }else{
                if(c==')'){
                    if(deque.isEmpty() || deque.peek()!='('){
                        return "no";
                    }else{
                        deque.pop();
                    }
                }else if(c==']'){
                    if(deque.isEmpty() || deque.peek()!='['){
                        return "no";
                    }else{
                        deque.pop();
                    }
                }
            }
        }
        if(deque.isEmpty()){
            return "yes";
        }else{
            return "no";
        }
    }
}