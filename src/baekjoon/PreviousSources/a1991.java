
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a1991 {
    public void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        NodeMgmt tree = new NodeMgmt();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            tree.add(st.nextToken().charAt(0), st.nextToken().charAt(0), st.nextToken().charAt(0));
        }
        System.out.println(tree);

    }

    public static class Node {
        Node left;
        Node right;
        char value;

        public Node(char value) {
            this.value = value;
        }
}
    public static class NodeMgmt {
        Node head = null;

        void add(char data,char left,char right) {
            if(this.head==null){
                if(data!='.'){
                    head = new Node(data);
                }if(left!='.'){
                    head.left=new Node(left);
                }if(right!='.'){
                    head.right=new Node(right);
                }
            }else{
                searchNode(head,data,left,right);
            }
        }

        void searchNode(Node head,char data, char left, char right) {
            if(head==null){
                return;
            }
            else{
                if(head.value==data){
                    if(left!='.'){
                        head.left = new Node(left);
                    }
                    if(right!='.'){
                        head.right = new Node(right);
                    }
                }
                else{
                    searchNode(head.left,data,left,right);
                    searchNode(head.right,data,left,right);
                }
            }

        }


    }



}

