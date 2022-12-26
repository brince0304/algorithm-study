import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class a10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch(st.nextToken()){
                case "push":
                    push(stack, Integer.parseInt(st.nextToken()));
                    break;
                case "top":
                    top(stack);
                    break;
                case "pop":
                    pop(stack);
                    break;
                case "empty":
                    empty(stack);
                    break;
                case "size":
                    size(stack);
                    break;
            }
        }
    }

    public static void push(Stack<Integer> stack, int num){
        stack.push(num);
    }
    public static void top(Stack<Integer> stack){
        if(stack.size()==0){
            System.out.println(-1);
        }
        else {
            System.out.println(stack.get(stack.size()-1));
        }

    }
    public static void empty(Stack<Integer> stack){
        if(stack.isEmpty()){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
    public static void size(Stack<Integer> stack){
        System.out.println(stack.size());
    }

    public static void pop(Stack<Integer> stack){
        if(!stack.isEmpty()){
            int n = stack.get(stack.size() - 1);
            stack.pop();
            System.out.println(n);
        }
        else{
            System.out.println(-1);
        }

    }
}
