import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class a17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stk = new Stack<>();
        String str = br. readLine();
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c=='<'){
                flag = true;
            }
            else if (c=='>'){
                flag = false;
            }
            else if(flag){
                System.out.print(c);
            }else if(!flag){
                if(c!=' '){
                    stk.push(c);
                }else{
                    while(!stk.isEmpty()) {
                        System.out.print(stk.pop());
                    }
                    System.out.print(c);
                }
            }


            }

        }

    }
